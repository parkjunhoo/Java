package chap06.oop.basic;

public class Staff extends Human{
	private String dept;
	
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
