package model;

public class Product {
	private int id_product;
	private int barcode;
	private String productName;
	private double purchasePrice;
	private double salesPrice;
	private String countryOfOrigin;
	private int minStock;
	private int currStock;
	private String productType;

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public int getCurrStock() {
		return currStock;
	}

	public void setCurrStock(int currStock) {
		this.currStock = currStock;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [" + 
				"id_product=" + id_product + 
				", barcode=" + barcode + 
				", productName=" + productName +
				", purchasePrice=" + purchasePrice +
				", salesPrice=" + salesPrice +
				", countryOfOrigin=" + countryOfOrigin +
				", minStock=" + minStock +
				", currrStock=" + currStock +
				", productType=" + productType +
				"]";
}
}
