package chap08.oop.polyinterface;

public abstract class Animal {
	private int speed;
	private double distance;
	
	public Animal() {
		
	}
	public Animal(int speed) {
		this.speed = speed;
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

	
	
	public abstract void run (int hours);
	
}
