package chap04.statement;

public class BasicForExam0 {

	public static void main(String[] args) {
		// 문제0 1부터 1000까지의 홀수의 합 짝수의합 총합을 출력하세요
		// 출력형태
		// 1부터 1000까지의 총합
		// 1부터 1000까지의 홀수의 합
		// 1부터 1000까지 짝수의 합

		int total = 0;
		int hol = 0;
		int jjak = 0;
		for (int i = 1; i <= 1000; i++) {
			total += i;
			if (i % 2 == 0) {
				jjak += i;
			} else {
				hol += i;
			}
		}

		System.out.println("1부터 1000까지의 총합 " + total);
		System.out.println("1부터 1000까지의 홀수의 총합 " + hol);
		System.out.println("1부터 1000까지의 짝수의 총합 " + jjak);
	}

}
