package api.lang;

public class Vehicle {
	private Owner owner;
	private int price;
	
	
	
	
	
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vehicle) {
			Vehicle other = (Vehicle)obj;
			if(this.owner.equals(other.owner)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return String.format("소유주정보 %s\r\n 차랑정보 : 가격은 %s 입니다.", this.owner.toString() , this.price);
	}
	
	
}
