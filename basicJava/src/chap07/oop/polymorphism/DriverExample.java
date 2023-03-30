package chap07.oop.polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver d = new Driver();
		Bus b = new Bus();
		Taxi t = new Taxi();
		Car c = new Car();
		d.drive(b);
		d.drive(t);
		d.drive(c);
	}

}
