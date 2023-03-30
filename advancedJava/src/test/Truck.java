package test;

public class Truck extends Car{
	private int weight;

	public Truck() {
		super();
	}
	
	public Truck(Point point , int speed) {
		super(point,speed);
	}
	
	public Truck(Point point , int speed , int weight) {
		super(point,speed);
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void run(int hour) {
		this.distance = super.getSpeed() * (hour * 0.7);
	}

	@Override
	public double calcToll() {
		double fee = this.distance * weight * 0.12;
		return fee;
	}

	@Override
	public void print() {
		Point p = this.getPoint();
		System.out.printf("트럭\t%5d\t%.1f\t\t%d\t%d\t%.1f\n", 
				this.getSpeed() , this.distance , p.getX() , p.getY() , this.calcToll());
	}
	
}
