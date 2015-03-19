package model;

public class Customer {
	private int id_customer;
	private int cpr;
	private String customerName;
	private String phNumber;
	private String customerType;
	private String customerStreet;
	private Address address;
	
	public Customer(int id_customer, int cpr, String customerName, String phNumber, String customerType,  String customerStreet, Address address) {
		this.setId_customer(id_customer);
		this.setCpr(cpr);
		this.setCustomerName(customerName);
		this.setPhNumber(phNumber);
		this.setCustomerType(customerType);
		this.setCustomerStreet(customerStreet);
		this.setAddress(address);
	}
	//id_customer
	public int getId_customer() {
		return id_customer;
	}
	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}
	//cpr
	public int getCpr() {
		return cpr;
	}
	public void setCpr(int cpr) {
		this.cpr = cpr;
	}
	//customerName
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	//phNumber
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	//customerType
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	//customerStreet
	public String getCustomerStreet() {
		return customerStreet;
	}
	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
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
		return "Customer [" + 
				"id_customer=" + id_customer + 
				", cpr=" + cpr + 
				", customerName=" + customerName +
				", phNumber=" + phNumber +
				", customerType=" + customerType +
				", customerStreet=" + customerStreet +
				", id_address=" + this.getAddress().getId_address() +
				"]";
	}
}
