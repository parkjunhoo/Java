package chap05.array;

public class VariableTypeTest {
// 기본형변수와 참조형변수의 비교
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		System.out.println("======기본형======");
		//기본형 변수에서 == 연산자는 값을 비교
		if(i==j) System.out.println("기본형 같다");
		else System.out.println("기본형 다르다");
		
		System.out.println("======참조형======");
		//참조형 변수에서 == 연산자는 주소를 비교
		String str1 = "자바";
		String str2 = "자바";
		
		//str1 = str2;
		
		
		
		if(str1==str2) System.out.println("참조형 같다");
		else System.out.println("참조형 다르다");
		
		//String 클래스에 할당된 문자열을 비교하고 싶은 경우 String클래스에서 지원되는 메소드를 이용해서 비교
		//str1이 참조하는 string 객체가 갖고 있는 문자열과 str2가 참조하는 string 객체가 갖고있는 문자열을 비교
		if(str1.equals(str2)) {
			
		}
	}

}
