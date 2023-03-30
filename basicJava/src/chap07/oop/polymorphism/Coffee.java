package chap07.oop.polymorphism;

public class Coffee extends Beverage{
	
	public static int amount;
	
	public Coffee() {
		amount++;
	}
	public Coffee(String name) {
		super(name);
		amount++;
	}
	
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void calcPrice() {
		switch(this.getName()) {
		case "Americano":{
			this.setPrice(1500);
			break;
		}
		case "CafeLatte":{
			this.setPrice(2500);
			break;
		}
		case "Cappuccino":{
			this.setPrice(3000);
			break;
		}
	}
	}

	
}
