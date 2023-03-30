package chap06.oop.basic;
//메소드의 매개변수나 리턴타입으로 참조형타입을 명시하는 경우 공유된다.
//참조형은 주소를 저장하고 있으므로 객체나 배열이 공유된다.
//메소드의 매개변수나 리턴타입으로 기본형이 명시하는 경우 값이 전달되는 것이므로 공유되지 않는다.
//클래스를 하나의 소스파일에 여러 개 정의하는 경우 public 클래스는 한 개만 정의할 수 있고
//public 클래스명과 파일명이 동일해야한다.
class Point{
	int x = 10;
	int y = 20;
}

public class CallByRefTest {

	public static void main(String[] args) {
		int i = 10;
		int[] arr = { 10 , 20 , 30 , 40 , 50 };
		Point p = new Point();
		System.out.println("****데이터변경전****");
		display(i,arr,p);
		change(i,arr,p);
	}
	
	public static void display(int j, int[] myArr , Point p) {
		System.out.println("기본형변수의 값=>"+j);
		System.out.println("배열변수의 값=>"+myArr[0]);
		System.out.println("객체의 인스턴스 변수의 값 x=>"+p.x+", y=>"+p.y);
	}
	
	public static void change(int k, int[] otherArr , Point p) {
		k = 20;
		
		otherArr[0] = 100;
		
		int temp = p.y;
		p.y = p.x;
		p.x = temp;
	}

}
