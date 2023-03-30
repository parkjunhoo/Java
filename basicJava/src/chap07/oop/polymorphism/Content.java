package chap07.oop.polymorphism;

public abstract class Content {
	private String title;
	private int price;
	
	public Content() {
		
	}
	public Content(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void totalPrice();
	
	
	public void show() {
		System.out.println(String.format(
				"%s 비디오의 가격은 %d 원 입니다.",
				this.title, this.price));
	}
}
