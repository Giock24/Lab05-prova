package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	
	private String productName;
	private double quantity;
	
	public ProductImpl(final String productName, final double quality) {
		this.productName = productName;
		this.quantity = quality;
	}

	public String getName() {
		return this.productName;
	}

	public double getQuantity() {
		return this.quantity;
	}
	
	public void incProduct() {
		this.quantity++;
	}
	
	public void addMoreProduct(double quantity) {
		if (quantity >= 0) {
			this.quantity += quantity;
		}
	}

	public String toString() {
		return "Product [productName=" + productName + ", quantity=" + quantity + "]";
	}
}
