package test;

import chap06.oop.basic.Person;

//chap06.oop 패키지에 작성된 Person클래스의 멤버 변수를 접근하기 위한
public class ObjTest {

	public static void main(String[] args) {
		//다른 패키지의 클래스를 사용하는 경우 import해야 한다.
		Person p = new Person(234,"박준후");
		//public 모든 패키지 모든 클래스에서 접근 가능
		//default 같은 패키지 모든 클래스에서 접근 가능
		//private 해당 클래스에서만 접근 가능
		//protected 같은 패키지 모든클래스 , 다른패키지 상속관계
	}

}
