package it.unibo.oop.lab05.ex3;

import java.util.Set;

import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse{
	
	private final String warehouseName;
	private final Set<Product> set;
	private final Set<String> setString;
	
	public WarehouseImpl (final String warehouseName) {
		this.warehouseName = warehouseName;
		this.set = new LinkedHashSet<>();
		this.setString = new LinkedHashSet<>();
	}

	public void addProduct(Product p) {
		String s = p.getName();
		for(Product pr : this.set) {
			if (s == pr.getName()) {
				pr.incProduct();
			}
		}
		this.set.add((ProductImpl)p);
	}

	public Set<String> allNames() {
		Set<String> copy;
		for(final Product p : this.set) {
			this.setString.add(p.getName());
		}
		copy = this.setString;
		return copy;
	}

	public Set<Product> allProducts() {
		Set<Product> copy = new LinkedHashSet<>();
		for(final Product p : this.set) {
			copy.add(p);
		}
		return copy;
	}
	
	public boolean containsProduct(Product p) {
		return this.set.contains(p);
	}

	public double getQuantity(String name) {
		double quantity = -1;
		for(final Product p : this.set) {
			if (p.getName() == name) {
				quantity = p.getQuantity();
			}
		}
		if (quantity == -1) {
			System.out.println(" WARNING! " + name + " Not Found!");
		}
		return quantity;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}

}
