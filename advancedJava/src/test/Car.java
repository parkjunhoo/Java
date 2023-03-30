package test;

public abstract class Car {
	private Point point;
	private int speed;
	protected double distance;
	
	public Car(){
		
	}
	public Car(Point point , int speed) {
		this.point = point;
		this.speed = speed;
	}
	
	
	
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public abstract void run(int hour);
	public abstract double calcToll();
	public abstract void print();
	
	public static void printTitle() {
		System.out.println("차종\tspeed\tdistance\tx좌표\ty좌표\t요금");
	}
}
