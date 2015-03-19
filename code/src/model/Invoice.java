package model;

import java.sql.Date;

public class Invoice {
	private int id_invoice;
	private Date invoiceDate;
	private Date paymentDate;
	public int getId_invoice() {
		return id_invoice;
	}
	public void setId_invoice(int id_invoice) {
		this.id_invoice = id_invoice;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	@Override
	public String toString() {
		return "Invoice [" + 
				"id_invoice=" + id_invoice + 
				", invoiceDate=" + invoiceDate + 
				", paymentDate=" + paymentDate +
				"]";
	

}
