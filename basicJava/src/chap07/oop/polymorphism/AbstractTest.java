package chap07.oop.polymorphism;


	abstract class Parent {
		public void test() {
			System.out.println("일반메소드");
		}
		public abstract void display(String msg);
	}
	
	class Child extends Parent{
		
		public void display(String msg) {
			System.out.println("디스플레이");
		}
	}
	
	public class AbstractTest {
		public static void main(String[] args) {
			Parent obj = new Child();
			obj.display("");
		}

}
