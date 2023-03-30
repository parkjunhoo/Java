package chap07.oop.polymorphism;

public class Tea extends Beverage{
	public static int amount;
	
	public Tea() {
		amount++;
	}
	public Tea(String name) {
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
			case "lemonTea":{
				this.setPrice(1500);
				break;
			}
			case "ginsengTea":{
				this.setPrice(2000);
				break;
			}
			case "redginsengTea":{
				this.setPrice(2500);
				break;
			}
		}
		
	}

	
}
