package chap06.oop.basic;

public class MyMethodTest {

	public static void main(String[] args) {
		System.out.println("*********프로그램시작*********");
		MyMethod m = new MyMethod();
		m.display();
		m.display("#");
		
		
		//3. 매개변수가 두개 , 리턴값이 없는 메소드의 호출
		m.display("&",30);
		
		//4. 매개변수와 리턴값이 모두 있는 메소드의 호출
		System.out.println(m.Sum(5, 5));;
	}
}
