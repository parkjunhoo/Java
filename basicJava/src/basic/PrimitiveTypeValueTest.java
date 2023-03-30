package basic;
//기본형 데이터 표현하기

public class PrimitiveTypeValueTest {

	public static void main(String[] args) {
		
		
		final int NUM2 = 200;
		System.out.println(NUM2);
		
		boolean boolVal = true;
		System.out.println(boolVal);
		
		byte b = 127;
		short s = 10000;
		int i = 2147483647;
		long l = 2147483648L;
		float f = 3.14f;
		double d = 3.14;
		
		char a = 'A';
		String str = "참조형인 String을 기본형처럼 표현하는 경우 리터럴은 큰 따옴표를 추가해서 구분";
		System.out.println(str);
		System.out.println(a);
		
		
		double val1 = 10;
		double val2 = 3;
		System.out.println(val1 / val2);
		
		
	}

}
