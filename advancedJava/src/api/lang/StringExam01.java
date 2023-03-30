package api.lang;

public class StringExam01 {

	public static void main(String[] args) {
		String str = "java";
		//str문자열이 다음과 같이 출력되도록 작업하세요.
		//출력형식
		//AVAJ
		
		
		String output = "";
		
		for(int i=str.length(); i>0; i--) {
			output += str.charAt(i-1);
		}
		
		System.out.println(output.toUpperCase());
	}

}
