package chap04.statement;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");

		int input = s.nextInt();
		String str = "";
		if (input < 0) {
			System.out.println("음수");
		} else {
			if (input % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			// String str = (input%2)==0 ? "짝수" : "홀수";
			System.out.println("양수이면서 " + str);
		}

	}

}
