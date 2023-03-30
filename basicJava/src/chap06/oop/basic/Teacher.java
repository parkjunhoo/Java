package chap06.oop.basic;

public class Teacher extends Human {
	private String subject;
	
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
