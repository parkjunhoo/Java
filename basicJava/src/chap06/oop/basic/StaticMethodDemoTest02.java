package chap06.oop.basic;

public class StaticMethodDemoTest02 {
	public static void main(String[] args) {
		StaticMethodDemo obj = new StaticMethodDemo();
		StaticMethodDemo obj2 = new StaticMethodDemo();
		StaticMethodDemo obj3 = new StaticMethodDemo();
		
		//클래스 메소드의 호출 = 
		StaticMethodDemo.test();
		
		StaticMethodDemoTest02 util = new StaticMethodDemoTest02();
		util.display();
	}
	
	public void display() {
		System.out.println("display()");
	}
}
