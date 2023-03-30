package chap04.statement;

public class ForExam_Alpha {

	public static void main(String[] args) {
		
		//int로 'A' = 65 , 'Z' = 90
		//char a ='A'; //65
		//char z = 'Z'; // 90
		//System.out.println((int)z);
		
		// i >> 65..90 
		for(int i=65; i<=90; i++) {
			//char로 형변환한 i 출력
			System.out.print((char)i);
		}
		
		for(char c = 'A'; c<='Z'; c++) {
			System.out.print(c);
		}
	}

}
