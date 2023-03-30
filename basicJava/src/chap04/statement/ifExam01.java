package chap04.statement;

import java.util.Scanner;

public class ifExam01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("숫자입력:");

		int input = s.nextInt();
		String answer = "";
		// String answer = (input%5)==0 ? "입력한 숫자는 5의 배수입니다." : "입력한 숫자는 5의 배수가 아닙니다.";

		if (input % 5 == 0) {
			answer = "입력한 숫자는 5의 배수입니다.";
		} else {
			answer = "입력한 숫자는 5의 배수가 아닙니다.";
		}
		
		System.out.println(answer);
	}

}
