package model;

import java.sql.Date;

public class SalesOrder {
	private int id_salesOrder;
	private Date salesDate;
	private String deliveryStatus;
	private Date deliveryDate;
	private boolean paid;
	private String deliveryStreet;
	private Address address;
	private Customer customer;
	private Invoice invoice;
	public int getId_salesOrder() {
		return id_salesOrder;
	}
	public void setId_salesOrder(int id_salesOrder) {
		this.id_salesOrder = id_salesOrder;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public String getDeliveryStreet() {
		return deliveryStreet;
	}
	public void setDeliveryStreet(String deliveryStreet) {
		this.deliveryStreet = deliveryStreet;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "SalesOrder [" + 
				"id_salesOrder=" + id_salesOrder + 
				", salesDate=" + salesDate + 
				", deliveryStatus=" + deliveryStatus +
				", deliveryDate=" + deliveryDate +
				", paid=" + paid +
				", deliveryStreet=" + deliveryStreet +
				"]";

}
}
