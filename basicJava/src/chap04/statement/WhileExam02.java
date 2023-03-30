package chap04.statement;

import java.util.Scanner;

//ForExam_GuGu.java를 while문으로 변경하기 ( 제출 )
public class WhileExam02 {

	public static void main(String[] args) {
		// 스캐너 인스턴스화
		Scanner s = new Scanner(System.in);

		// 메세지 출력
		System.out.print("단:");

		// input 변수에 스캐너로 받은 값 대입
		int input = s.nextInt();

		// count >> 1..9
		int count = 1;
		
		while(count<=9) {
			System.out.println(input + " * " + count + " = " + input * count);
			count++;
		}
	}

}
