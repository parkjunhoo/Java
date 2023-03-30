package chap06.oop.basic;

import java.util.Random;

//메소드의 매개변수,리턴타입으로 클래스를 정의하고 사용할 수 있다.
public class MethodArgTest {

	public static void main(String[] args) {
		Random rand = new Random();
		MethodArgTest obj = new MethodArgTest();
		obj.test(rand, new Person2());
		
		Person2 p = obj.test2();
		System.out.println(p.getName());
		System.out.println(p.getAddr());
	}
	//메소드의 매개변수로 클래스를 정의하고 사용
	public void test(Random rand, Person2 p) {
		System.out.println(p.getName());
	}
	//메소드의 리턴타입으로 클래스를 정의하고 사용
	public Person2 test2() {
		Person2 p = new Person2();
		p.setName("장동건");
		p.setAddr("서울");
		return p;
	}
}
