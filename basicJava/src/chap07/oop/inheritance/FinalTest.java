package chap07.oop.inheritance;
//final

//변수 => 상수로 정의
//메소드 => 오버라이딩 할 수 없는 메소드
//클래스 => 상속할 수 없는 클래스


class A {
	public void test() {
		System.out.println("부모디스플레이");
	}

	public final void login(String pass) {
		// 보안이 필요한 너무나 중요한 메소드
		// 비밀번호로 인증해서 금액을 인출하는 기능
		System.out.println("부모클래스의 중요한 메소드 - 인증하고 액세스하기");
	}
}

class B extends A {
	// 일반메소드
	public void test() {
		System.out.println("자식디스플레이");
	}

}

public class FinalTest {

	public static void main(String[] args) {
		B obj = new B();
		obj.login(null);
	}

}
