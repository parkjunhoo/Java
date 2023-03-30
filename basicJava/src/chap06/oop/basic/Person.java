package chap06.oop.basic;
//클래스를 정의하고 멤버변수를 정의하는 방법
public class Person {
	
	String name;
	String addr;
	int age;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void Talk() {
		System.out.println("my Name is "+name);
		System.out.println("my age is "+age);
	}
}
