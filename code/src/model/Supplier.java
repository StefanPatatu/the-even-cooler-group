package model;

public class Supplier {
	private int id_supplier;
	private String supplierName;
	private String phoneNr;
	private String email;
	private String supplierStreet;
	private Address address;
	
	public Supplier(int id_supplier, String supplierName, String phoneNr, String email, String supplierStreet, Address address) {
		this.setId_supplier(id_supplier);
		this.setSupplierName(supplierName);
		this.setPhoneNr(phoneNr);
		this.setEmail(email);
		this.setSupplierStreet(supplierStreet);
		this.setAddress(address);
	}
	//id_supplier
	public int getId_supplier() {
		return id_supplier;
	}
	public void setId_supplier(int id_supplier) {
		this.id_supplier = id_supplier;
	}
	//supplier_name
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	//phoneNr
	public String getPhoneNr() {
		return phoneNr;
	}
	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}
	//email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//supplierStreet
	public String getSupplierStreet() {
		return supplierStreet;
	}
	public void setSupplierStreet(String supplierStreet) {
		this.supplierStreet = supplierStreet;
	}
	//address
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Supplier [" + 
				"id_supplier=" + id_supplier + 
				", supplierName=" + supplierName + 
				", phoneNr=" + phoneNr +
				", email=" + email +
				", supplierStreet=" + supplierStreet +
				", id_address=" + this.getAddress().getId_address() +
				"]";
	}
}
