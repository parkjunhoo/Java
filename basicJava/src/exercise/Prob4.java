package exercise;


public class Prob4 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		final int FIRST_CODE = 97;
		final int LAST_CODE = 122;
		
		for(int i =0; i<sourceString.length(); i++) {
			if(sourceString.charAt(i) == ' ') {
				encodedString += ' ';
				continue;
			}
			int code = (int)sourceString.charAt(i) + 3;
			
			if(code > LAST_CODE) {
				code -= (LAST_CODE-FIRST_CODE+1);
			}
			
			encodedString += (char)code;
		}
		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
	}

}

