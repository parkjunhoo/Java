package chap04.statement;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("단:");
		int dan = s.nextInt();
		switch(dan) {
			case 2:
				System.out.println("2단");
				break;
			case 3:
				System.out.println("3단");
				break;
			default:
				System.out.println("나머지");
				break;
		}
	}

}
