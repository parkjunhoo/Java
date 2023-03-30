package chap07.oop.polymorphism;

public abstract class Beverage {
	private String name;
	private int price;
	
	public Beverage() {
		
	}
	
	public Beverage(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void calcPrice();
	
	public void print() {
		
	}
}
