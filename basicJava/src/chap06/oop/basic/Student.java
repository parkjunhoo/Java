package chap06.oop.basic;

public class Student extends Human {
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	protected String addMoreInfo() {
		
		return "학  번 : "+this.id;
	}
}

