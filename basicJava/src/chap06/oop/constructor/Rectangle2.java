package chap06.oop.constructor;

public class Rectangle2 {
	private int width;
	private int length;
	private String color;
	private int area;
	
	public Rectangle2() {
		
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void calculateArea() {
		this.area = this.width * this.length;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	public int area() {
		return this.width * this.length;
	}
	public int perimeter() {
		return  2 * (this.width + this.length);
	}
	
}
