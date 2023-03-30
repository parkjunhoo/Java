package chap04.statement;

import java.util.Scanner;

public class ForExam_GuGu {

	public static void main(String[] args) {
		//스캐너 인스턴스화
		Scanner s = new Scanner(System.in);
		
		//메세지 출력
		System.out.print("단:");
		
		//input 변수에 스캐너로 받은 값 대입
		int input = s.nextInt();
		
		//i >> 1..9
		for(int i=1; i<=9; i++) {
			//메세지 출력	예:) 2 * 2 = 4
			System.out.println(input+" * "+i+" = "+input*i);
		}
	}
}
