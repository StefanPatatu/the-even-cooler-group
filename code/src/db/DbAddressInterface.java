package db;

import java.util.List;
import model.Address;

public interface DbAddressInterface {
	public List<Address> getAllAddresses();
	public Address findAddress(int id_address);
	public List<Address> searchAddressByZipcode(int zipcode);
	public List<Address> searchAddressByCity(String city);
	public int updateAddress(Address a);
	public int removeAddress(Address a);
	public int insertAddress(Address a);
}
