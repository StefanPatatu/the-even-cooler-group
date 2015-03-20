package model;

public class Address {
	private int id_address;
	private int zipcode;
	private String city;
	
	public Address(int id_address, int zipcode, String city) {
		this.setId_address(id_address);
		this.setZipcode(zipcode);
		this.setCity(city);
	}
	public Address(int id_address) {
		this.setId_address(id_address);
	}
	//id_address
	public int getId_address() {
		return id_address;
	}
	public void setId_address(int id_address) {
		this.id_address = id_address;
	}
	//zipcode
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	//city
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [" + 
				"id_address=" + id_address + 
				", zipcode=" + zipcode + 
				", city=" + city +
				"]";
	}
}
