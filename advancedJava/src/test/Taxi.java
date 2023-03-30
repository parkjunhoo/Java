package test;

public class Taxi extends Car{
	private int taxifare;
	
	public Taxi() {
		super();
	}
	
	public Taxi(Point point , int speed) {
		super(point,speed);
	}
	
	public Taxi(Point point , int speed , int taxifare) {
		super(point,speed);
		this.taxifare = taxifare;
	}
	
	public void setTaxifare(int taxifare) {
		this.taxifare = taxifare;
	}
	
	@Override
	public void run(int hour) {
		this.distance = super.getSpeed() * hour;
	}

	@Override
	public double calcToll() {
		double fee = this.distance * taxifare * 0.023;
		return fee;
	}

	@Override
	public void print() {
		Point p = this.getPoint();
		System.out.printf("택시\t%5d\t%.1f\t\t%d\t%d\t%.1f\n", 
				this.getSpeed() , this.distance , p.getX() , p.getY() , this.calcToll());
	}
	
}
