package logic;

import java.util.ArrayList;

public class Controller {

	private ArrayList<Product> products;
	
	public Controller() {
		this.products = new ArrayList<Product>();
	}
	
	
	public ArrayList<Product> getProducts(){
		return this.products;
	}
	
	
	public void saveProduct(int id, String name, String direction, int avilableAmount) {
		this.products.add(new Product(id, name, direction, avilableAmount));
	}
	
}
