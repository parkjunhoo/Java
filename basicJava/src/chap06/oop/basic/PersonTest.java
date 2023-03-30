package chap06.oop.basic;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p = new Person(10,"박준후");
		p.Talk();
		
		System.out.println("======================");
		
		p = new Person(-11 , "후준박");
		p.Talk();
	}

}
