package chap06.oop.basic;
// 자바의 특성에 맞게 정의된 클래스를 사용
public class PersonTest2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2();
		p1.setName("정국");
		//서울시, 20설정
		p1.setAddr("서울시");
		p1.setAge(20);
		//getter메소드 호출하기
		
		String name = p1.getName();
		String addr = p1.getAddr();
		int age = p1.getAge();
		String result = String.format("성명:%s 주소:%s 나이:%d", name,addr,age);
		System.out.println(result);
		//설정된 정보 출력하기
		
		
		//Person2객체를 생성하고
		Person2 p2 = new Person2();
		//setter메소드를 호출하여 값을 셋팅한다.
		p2.setName("지민");
		p2.setAddr("인천시");
		p2.setAge(25);
		//지민,인천시 , 25
		String name2 = p2.getName();
		String addr2 = p2.getAddr();
		int age2 = p2.getAge();
		//셋팅된 객체의 값을 출력해보기
		String result2 = String.format("성명:%s 주소:%s 나이:%d", name2,addr2,age2);
		System.out.println(result2);
	}

}
