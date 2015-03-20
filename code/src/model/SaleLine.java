package model;

public class SaleLine {
private int id_saleLine;
private int amount;
private double price;
private Product product;
private SalesOrder salesOrder;
public int getId_saleLine() {
	return id_saleLine;
}
public void setId_saleLine(int id_saleLine) {
	this.id_saleLine = id_saleLine;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public SalesOrder getSalesOrder() {
	return salesOrder;
}
public void setSalesOrder(SalesOrder salesOrder) {
	this.salesOrder = salesOrder;
}
@Override
public String toString() {
	return "Sale Line [" + 
			"id_saleLine=" + id_saleLine + 
			", amount=" + amount + 
			", price=" + price +
			", id_product=" + product.getId_product()+
			", id_salesOrder=" + salesOrder.getId_salesOrder()+
			"]";

}
}
