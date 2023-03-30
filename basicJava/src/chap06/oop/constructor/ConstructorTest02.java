package chap06.oop.constructor;
//생성자 테스트하기
public class ConstructorTest02 {

	public static void main(String[] args) {
		//1. 컴파일러가 기본 생성자를 제공한다.(생성자 정의X)
		Constructor obj = new Constructor();
		obj.setName("슈가");
		//2. 매개변수가 3개 정의된 생성자를 호출
		//객체를 생성하면서 객체가 갖고있는 멤버변수 name id pass 초기화
		Constructor obj2 = new Constructor("장동건","jang","1234");
		
		System.out.println("성명:"+obj.getName());
		System.out.println("닉네임:"+obj.getNickname());
		System.out.println("=========================");
		System.out.println("성명:"+obj2.getName());
		System.out.println("닉네임:"+obj2.getNickname());
		System.out.println("=========================");
		Constructor obj3 = new Constructor("진", "bts", "bts1234", "서울", "010", "jin", 1234);
		
	}
}