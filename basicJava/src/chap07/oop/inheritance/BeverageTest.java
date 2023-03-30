package chap07.oop.inheritance;

class Beverage {
	private String type;
	private int price;

	public Beverage(String type, int price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class Coffe extends Beverage {
	private String name;

	public Coffe(String type, int price, String name) {
		super(type, price);
		this.name = name;
	}

	public void print() {
		System.out.println(
				String.format("타입:%s,이름:%s,가격%d", super.getType() , this.name , super.getPrice())
				);
	}
}

public class BeverageTest {
	public static void main(String[] args) {
		Coffe obj1 = new Coffe("커피", 2500, "아메리카노");
		Coffe obj2 = new Coffe("커피", 2700, "카페라뗴");
		Coffe obj3 = new Coffe("커피", 300, "카푸치노");
		obj1.print();
		obj2.print();
		obj3.print();
	}

}
