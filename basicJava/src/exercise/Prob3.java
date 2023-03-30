package exercise;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");

		int inputInt = 1;
		try {
			inputInt = keyboard.nextInt();
		} catch (Exception e) {
			System.err.print("입력하신 값은 Integer Type이 아닙니다.");
			return;
		}

		// 프로그램을 구현하세요.
		if (inputInt < 2 || inputInt > 9) {
			System.err.print("잘못된 숫자가 입력되었습니다.");
			return;
		}

		int numFac = 1;
		for (int i = 1; i <= inputInt; i++) {
			numFac *= i;
		}
		String str = String.format("%d ! = %d", inputInt, numFac);
		System.out.println(str);

	}
}
