package chap04.statement;

import java.util.Scanner;

public class Prob3 {
	public static void main(String args[]) {

		int number = 0;

		System.out.print("2 ~ 100사이의 정수를 입력하세요.  : ");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		if (number < 2 || number > 100) {
			System.out.println("범위의 값을 입력해주세요.");
			return;
		}

//		// 소수판별을 제대로 하는지 TEST.
//		int count=2;
//		while(count!=100) {
//			boolean isSosu = true;
//			/*  이곳에 프로그램을 완성하십시오. */  
//			for(int i=2; i<count; i++) {
//				if(count%i == 0) {
//					isSosu = false;
//					break;
//				}
//			}
//			String str = isSosu? "입니다" : "가 아닙니다.";
//			System.out.println(count+"는(은) 소수"+str);
//			count++;
//		}

		boolean isSosu = true;
		/* 이곳에 프로그램을 완성하십시오. */
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isSosu = false;
				break;
			}
		}
		String str = isSosu ? "입니다" : "가 아닙니다.";
		System.out.println(number + "는(은) 소수" + str);

	}

}
