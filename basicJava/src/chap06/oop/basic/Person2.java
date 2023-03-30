package chap06.oop.basic;

//자바의 특성에 맞게 클래스를 정의
//멤버 변수는 (클래스의 속성 구성요소 클래스에서 다루는 데이터)는 private
public class Person2 {
	// private로 정보를 은닉
	private String name;
	private String addr;
	private int age;

	// 모든 멤버 변수가 private로 선언되어 있으므로
	// 값을 할당하는 메소드와 값을 반환하는 메소드가 필요
	// 메소드명: getter = getVarName
	// setter = setVarName

	///// name Getter / Setter /////
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	////////////////////////////////

	///// addr Getter / Setter /////
	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	////////////////////////////////

	///// age Getter / Setter /////
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	////////////////////////////////
}
