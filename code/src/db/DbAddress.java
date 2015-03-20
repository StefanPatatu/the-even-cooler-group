package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Address;

public class DbAddress implements DbAddressInterface{

	@Override
	public List<Address> getAllAddresses() {
		return miscWhere("", false);
	}

	@Override
	public Address findAddress(int id_address) {
		Address a = singleWhere("id_address = " + id_address, false);
		return a;
	}

	@Override
	public List<Address> searchAddressByZipcode(int zipcode) {
		return miscWhere("zipcode LIKE '%" + zipcode + "%'", false);
	}

	@Override
	public List<Address> searchAddressByCity(String city) {
		return miscWhere("city LIKE '%" + city + "%'", false);
	}

	@Override
	public int updateAddress(Address a) {
		int res = 0;
		String q = "UPDATE Address SET zipcode=?, city=? WHERE id=?";
		try(PreparedStatement s = DbConnection.getInstance().getDBcon().prepareStatement(q)) {
			s.setInt(1, a.getZipcode());
			s.setString(2, a.getCity());
			res = s.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		return res;
	}

	@Override
	public int removeAddress(Address a) {
		if(a == null) {
			return 0;
		}
		int res = 0;
		String q = "DELETE FROM Address WHERE id_address = " + a.getId_address();
		try(Statement s = DbConnection.getInstance().getDBcon().createStatement()) {
			res = s.executeUpdate(q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int insertAddress(Address a) {
		int res = 0;
		String q = "INSERT INTO Address (zipcode, city) values ('" + a.getZipcode() + "', '" + a.getCity() + "')";
		try (Statement s = DbConnection.getInstance().getDBcon().createStatement()) {
			res = s.executeUpdate(q, Statement.RETURN_GENERATED_KEYS);
			int id_address = new GeneratedKey().getGeneratedKey(s);
			a.setId_address(id_address);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	private String buildQuery(String where) {
		String q = "SELECT * FROM Address";
		if(where != null && where.length() >0) {
			q += " WHERE" + where;
		}
		return q;
	}
	
	private Address buildAddress(ResultSet rs) {
		Address a = null;
		try {
			a = new Address(rs.getInt("id_address"),
					rs.getInt("zipcode"),
					rs.getString("city"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	
	private Address singleWhere(String where, boolean retrieveAssoc) {
		List<Address> addresses = miscWhere(where, retrieveAssoc);
		if(addresses.size() > 0) {
			return addresses.get(0);
		}
		return null;
	}
	
	private List<Address> miscWhere (String where, boolean retrieveAssoc) {
		ResultSet rs;
		List<Address> addresses = new ArrayList<>();
		String q = buildQuery(where);
		try (Statement s = DbConnection.getInstance().getDBcon().createStatement()) {
			s.setQueryTimeout(5);
			rs = s.executeQuery(q);
			while(rs.next()) {
				Address a = buildAddress(rs);
				if(retrieveAssoc) {
					//nothing
				}
				addresses.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return addresses;
	}

}
