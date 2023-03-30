package chap07.oop.inheritance;
/*
 * <<상속관계에서 메소드가 갖는 특징>>
 * 1. 상위클래스에서 정의된메소드를 하위클래스에서 호출할 수 있다.
 * 	=> 하위 클래스 타입의 참조;변수를 통해서도 상위클래스의 메소드를 접근할 수 있다.
 * 
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에 정의하면 하위클래스의 메소드가 우선인식되어 호출된다.
 * 	=>상위 클래스에 정의된 메소드와 동일한 스펙을 갖는 메소드를 정의하는 것을 메소드의 재정의라고 한다.
 * 	즉, 메소드 오버라이딩이라고 한다.
 * 
 * 오버라이딩 :
 * 오버라이딩하는 경우 반드시 메소드의 선언부(리턴타입 , 매개변수 갯수 , 매개변수 타입 , 메소드명)가 상위클래스의 메소드와 동일
 * 
 * 3. 상위클래스의 메소드를 호출하려면 super를 이용해서 호출
 * 
 */
class Parent{
	protected int a = 10;
	public void display() {
		System.out.println(a);
		System.out.println("부모클래스의 display()");
	}
}
class Child extends Parent{
	int a = 120;
	public void test() {
		System.out.println("자식클래스의 test()");
		display();
	}
	
	public void display() {
		System.out.println("자식클래스의 display()");
	}
}
public class InheritanceTest02 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();
	}

}
