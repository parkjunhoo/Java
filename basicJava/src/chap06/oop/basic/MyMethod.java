package chap06.oop.basic;
//메소드를 정의하는 연습을 하기 위한 클래스
public class MyMethod {
	//4. 매개변수 , 리턴값이 모두 있는 메소드
	// => 숫자 2개를 매개변수로 전달받아서 더한 후 결과를 리턴하는 메소드
	public int Sum(int num1, int num2) {
		return num1 + num2;
	}
	
	
	//3. 리턴값이 없고 매개변수가 두 개 인 메소드
	// => 출력할 기호, 출력할 횟수를 매개변수로 전달 받아서
	public void display(String s , int count) {
		for(int i=0; i<count; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	
	//1. 매개변수가 없고 리턴값이 없는 메소드
	public void display() {
		for(int i=1; i<=10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void display(String s) {
		for(int i=1; i<=10; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
}