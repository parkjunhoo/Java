package chap05.array;
//참조형 변수의 특징 살펴보기
public class RefVariableTest {

	public static void main(String[] args) {
		//기본형변수는 0으로 초기화
		//참조형변수는 null 초기화
		int sum = 0;
		//변수가 선언되는 시점이 아니라 실행하면서 객체를 생성하는경우 초기값을 null로 할당한다.
		String str = null; //str참조변수는 어떤 객체도 참조하고 있지 않다. (주소값이 아직 저장되지 않은 참조변수)
		//str변수는 아직 객체를 참조하고 있지 않지만 타입이 String이므로 컴파일러가 오류라고 인지 하지 않는다.
		str.length();
		
		
	}

}
