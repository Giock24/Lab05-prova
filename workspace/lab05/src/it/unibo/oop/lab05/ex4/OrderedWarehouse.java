package it.unibo.oop.lab05.ex4;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl {

	private final NavigableSet<Product> set;
	private final Set<String> setString;
	
	public OrderedWarehouse(String warehouseName) {
		super(warehouseName);
		this.set = new TreeSet<>();
		this.setString = new TreeSet<>();
	}
	
	@Override
	public void addProduct(Product p) {
		this.set.add((ComparableProduct) p);
	}
	
	@Override
	public Set<String> allNames() {
		Set<String> copy;
		for(final Product p : this.set) {
			this.setString.add(p.getName());
		}
		copy = this.setString;
		return copy;
	}
	
	@Override
	public Set<Product> allProducts() {
		Set<Product> copy = new TreeSet<>();
		for(final Product p : this.set) {
			copy.add(p);
		}
		return copy;
	}
	

}
