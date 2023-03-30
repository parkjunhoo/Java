package chap07.oop.polymorphism;
//객체의 형변환
//사용자정의 클래스

class Super{
	String data = "상위클래스";
	String data2 = "hi";
	public void display() {
		System.out.println("Super의 display...");
	}
}
class Sub extends Super{
	String data = "하위클래스";
	
	public Sub() {
	}
	public Sub(String data2) {
		this.data2 = data2;
	}
	public void display() {
		System.out.println("Sub의 display...");
	}
	public void test() {
		System.out.println("sub의 test");
	}
}
public class RefTypeCastingTest02 {

	public static void main(String[] args) {
		System.out.println("1. Super타입의 참조변수로 Super객체를 사용");
		Super obj1 = new Super();
		obj1.display();
		System.out.println(obj1.data);
		System.out.println("********************************************");
		
		System.out.println("2. Sub타입의 참조변수로 Sub객체를 사용");
		Sub obj2 = new Sub();
		System.out.println(obj2.data);//부모의 변수와 동일한 변수가 정의된 경우에는 부모의 변수가 아니라 내 클래스에서 선언된 변수가 인식
		obj2.display();// 상속관계에서 오버라이딩된 메소드가 있는 경우 부모의 메소드가 아니라 오버라이딩된 메소드가 호출된다.
		
		System.out.println("********************************************");
		System.out.println("3. Super타입의 참조변수로 Sub객체를 사용");
		//자동형변환
		//참조변수가 Super타입이므로 Super의 멤버만 접근할 수 있다.
		//new Sub가 가능한 이유는 Sub의 멤버와 Super의멤버를 모두 갖고 있기 때문에 가능
		Super obj3 = new Sub("33");
		System.out.println(obj3.data2);
		obj3.display();
		((Sub)obj3).test();
		
		System.out.println("********************************************");
		System.out.println("4.Sub타입의 참조변수로 Super객체를 사용");
		//Sub obj4 = new Super();
		
		System.out.println("********************************************");
		System.out.println("5. Sub변수 = Super객체를 참조하는 변수");
//		Sub obj5 = (Sub)obj1;
//		obj5.test();
		
		System.out.println("********************************************");
		System.out.println("6. Sub변수 = Sub객체를 참조하는 Super변수");
		Sub obj6 = (Sub)obj3;
		obj6.test();
		
	}
}
