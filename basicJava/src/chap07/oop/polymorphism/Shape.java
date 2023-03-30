package chap07.oop.polymorphism;

public abstract class Shape {
	private double area;
	private String name;
	
	public Shape() {
		
	}
	public Shape(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(this.name+"의 면적은 "+getArea());
	}
	
}
