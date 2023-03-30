package api.lang;

public class Prob1 {

	public static void main(String args[]) {
		
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 8, '#') );
		System.out.println( prob1.leftPad("SDS", 7, '$') ); 
		System.out.println( prob1.leftPad("SDS", 5, '&') );
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */
		int length = str.length();
		String leftStr = "";
		if(length > size) {
			return str;
		}
		
		for(int i =0; i<size-length; i++) {
			leftStr += padChar;
		}
		
		return leftStr+str;
	}
	
}
