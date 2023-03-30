package chap07.oop.polymorphism;

public class InstanceOfTest {

	public static void main(String[] args) {
		Beverage obj = new Coffee("아메리카노");
		Beverage obj2 = new Tea("케모마일");
		Beverage obj3 = new Coffee("카푸치노");
		String str = new String("java");
		//객체의 타입을 확인할 수 있는 연산자 - instanceof
		System.out.println(obj instanceof Beverage);
	}
}
