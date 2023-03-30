package chap04.statement;

import java.util.Scanner;

public class Prob1 {
	public static void main(String args[]) {

		// 사용자가 입력한 정수
		int inputInt = 0;

		// 스캐너 keyboard 인스턴스
		Scanner keyboard = new Scanner(System.in);

		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");

		inputInt = keyboard.nextInt();

		// 프로그램을 구현하세요.

		// 사용자가 입력한 값이 2보다 작거나
		if (inputInt < 2 || inputInt > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(inputInt + " * " + i + " = " + inputInt * i);
		}

	}
}
