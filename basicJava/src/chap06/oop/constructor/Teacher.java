package chap06.oop.constructor;

public class Teacher extends Human {
	private String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String name , int age , String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	///////////////////////////////
	public String getSubject() {
	return this.subject;
	}
	public void setSubject(String subject) {
	this.subject = subject;
	}
	///////////////////////////////
	
	
	protected String addMoreInfo() {
		
		return "담당과목 : "+this.subject;
	}
}
