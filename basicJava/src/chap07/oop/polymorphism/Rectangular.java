package chap07.oop.polymorphism;

public class Rectangular extends Shape{
	private double width;
	private double height;
	
	public Rectangular() {
		
	}
	public Rectangular(String name, double width , double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calculationArea() {
		setArea(width * height);
	}
	
}
