package chap07.oop.polymorphism;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		
	}
	public Circle(String name , double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public void calculationArea() {
		setArea(Math.PI * radius * radius);
	}
	
}
