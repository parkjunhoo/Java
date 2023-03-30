package chap06.oop.constructor;

public class Staff extends Human{
	private String dept;
	
	public Staff() {
		
	}
	
	public Staff(String name , int age , String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public String getDept() {
	return this.dept;
	}
	public void setDept(String dept) {
	this.dept = dept;
	}
	///////////////////////////////
	
	
	protected String addMoreInfo() {
		return "부  서 : "+this.dept;
	}
}
