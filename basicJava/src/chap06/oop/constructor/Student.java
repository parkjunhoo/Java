package chap06.oop.constructor;

public class Student extends Human {
	private int id;

	public Student() {
		
	}
	
	public Student(String name , int age , int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
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

