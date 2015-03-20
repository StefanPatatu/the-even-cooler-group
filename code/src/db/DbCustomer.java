package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Address;

public class DbCustomer implements DbCustomerInterface {
	private Connection con;
	public DbCustomer() {
		con = DbConnection.getInstance().getDBcon();
	}

	@Override
	public List<Customer> getAllCustomers(boolean retrieveAssoc) {
		List<Customer> res = miscWhere("", retrieveAssoc);
		return res;
	}

	@Override
	public Customer findCustomer(int id, boolean retrieveAssoc) {
		Customer c = singleWhere("id_customer = " + id, retrieveAssoc);
		return c;
	}

	@Override
	public List<Customer> searchCustomer(String name, boolean retrieveAssoc) {
		return miscWhere("customerName LIKE '%" + name +"%'", retrieveAssoc);
	}

	@Override
	public int updateCustomer(Customer c) {
		int res = 0;
		String s = "UPDATE Customer SET";
		return res;
	}

	@Override
	public int removeCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private String buildQuery(String where) {
		String q = "SELECT * FROM Customer";
		if (where != null && where.trim().length() > 0) {
			q += "where" + where;
		}
		return q;
	}
	
	private Customer buildCustomer(ResultSet rs) {
		Customer c = null;
		try {
			c = new Customer(rs.getInt("id_customer"),
					rs.getInt("cpr"),
					rs.getString("customerName"),
					rs.getString("phNumber"),
					rs.getString("customerType"),
					rs.getString("customerStreet"),
					new Address(rs.getInt("id_address")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	private Customer singleWhere(String where, boolean retrieveAssoc) {
		List<Customer> customers = miscWhere(where, retrieveAssoc);
		if(customers.size()>0) {
			return customers.get(0);
		}
		return null;
	}
	
	private List<Customer> miscWhere(String where, boolean retrieveAssoc) {
		ResultSet rs;
		List<Customer> customers = new ArrayList<>();
		String q = buildQuery(where);
		try(Statement s = DbConnection.getInstance().getDBcon().createStatement()) {
			s.setQueryTimeout(5);
			rs = s.executeQuery(q);
			while(rs.next()) {
				Customer c = buildCustomer(rs);
				if(retrieveAssoc) {
					Address a = new DbAddress().findAddress(c.getAddress().getId_address());
					c.setAddress(a);
				}
				customers.add(c);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

}
