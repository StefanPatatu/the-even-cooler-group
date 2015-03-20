package model;

public class ProductSupplier {
	private int id_productSupplier;
	private Product product;
	private Supplier supplier;
	public int getId_productSupplier() {
		return id_productSupplier;
	}
	public void setId_productSupplier(int id_productSupplier) {
		this.id_productSupplier = id_productSupplier;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "ProductSupplier [" + 
				"id_productSupplier=" + id_productSupplier + 
				"id_product=" + product.getId_product() +
		"id_supplier=" + supplier.getId_supplier() +
				
				"]";
}
}
