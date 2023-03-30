package chap06.oop.basic;

public class StaticDemoTest {

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		sd.display();
		//num변수와 staticNum변수는 다른 개념(StaticDemo.java참고)의 변수이므로
		//사용방법이 다르다.
		//num과 같은 인스턴스가 가진 변수는 객체참조변수를 통해서 사용이 가능하지만
		//staticNum과 같은 static 변수는 객체의 소유가 아니라 클래스에 정의된 공통변수 이므로
		//클래스명으로 액세스한다.
		//클래스명.변수
		System.out.println("main==>"+sd.num+","+StaticDemo.staticNum);
		
		StaticDemo sd2 = new StaticDemo();
		sd2.display();
		System.out.println("main==>"+sd2.num+","+StaticDemo.staticNum);
		
		StaticDemo sd3 = new StaticDemo();
		sd3.display();
		System.out.println("main==>"+sd3.num+","+StaticDemo.staticNum);
		
		System.out.println(Math.PI);
		
		
	}

}
