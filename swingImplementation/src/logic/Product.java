package logic;

public class Product {
	
	private int id;
	private String name;
	private String direction;
	private int avilableAmount;
	
	public Product(int id, String name, String direction, int avilableAmount) {
		this.name = name;
		this.direction = direction;
		this.avilableAmount = avilableAmount;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getAvilableAmount() {
		return avilableAmount;
	}

	public void setAvilableAmount(int avilableAmount) {
		this.avilableAmount = avilableAmount;
	}
	
}
