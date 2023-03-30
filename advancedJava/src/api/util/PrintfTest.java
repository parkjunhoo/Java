package api.util;
//System.out.printf 메소드 확인
public class PrintfTest {

	public static void main(String[] args) {
		String str = "java programming";
		String str2 = "재밌다.";
		/*
		 * 출력형식을 기호를 이용해서 설정
		 * %d	정수
		 * %s	문자열
		 * %f	실수
		 * %n	줄바꿈
		 */
		
		System.out.printf("[%-20s],%n",str);
		System.out.printf("%d %n",1000); 
		System.out.printf("값 =>(%5.2f,%d) %n",1000.123,2000);
		System.out.printf("값 =>(%1.2f,%d) %n",1000.123,2000);
		
	}

}
