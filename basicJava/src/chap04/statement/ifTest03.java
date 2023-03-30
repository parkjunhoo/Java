package chap04.statement;

import java.util.Scanner;

public class ifTest03 {
//if문 중첩하기
	public static void main(String[] args) {
		//IfTest02와 동일한 작업을 처리
		//단, jumsu는 0보다 작거나 100보다 큰 값을 입력 받으면 "잘못입력"
		
		Scanner s = new Scanner(System.in);
		System.out.print("점수 입력:");
		int jumsu = s.nextInt();
		String result = "";
		
		if(jumsu>=0 && jumsu <=100) {
			result = jumsu >= 90 ? "pass" : "fail";
			System.out.println("점수는"+jumsu+"점이고 , "+result);
		}
		else {
			System.out.println("점수가 잘못 입력 됬습니다.");
		}
		
	}

}
