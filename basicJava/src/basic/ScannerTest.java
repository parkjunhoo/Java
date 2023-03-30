package basic;

import java.util.Scanner;

//키보드로 입력 받은 값을 프로그램 안에서 사용할 수 있도록 기능을 제공
//모니터로 출력 - 표준 출력 : System.out
//키보드로 입력 - 표준 입력 : System.in
//Ctrl+Shift+o: 자동import
public class ScannerTest {

	public static void main(String[] args) {
		//key
		//키보드로 입력되는 값을 Scanner클래스에서 사용하도록 정의
		Scanner key = new Scanner(System.in);
		System.out.println("단어 입력:");
		String data = key.next();
		System.out.println("사용자가 입력한 값은=>"+data);
		
		System.out.println("실수입력:");
		double doubleData = key.nextDouble();
		System.out.println("사용자가 입력한 실수=>"+doubleData);
		
		System.out.println("정수 입력:");
	    int intData = key.nextInt();
	    System.out.println("사용자가 입력한 정수=>"+intData);
	    
	    key.close();
	}

}
