package chap07.oop.polymorphism;

public class Car extends Vehicle{
	public Tire tire;
	
	public void run() {
		tire = new HankookTire();
		tire.roll();
	}
}
