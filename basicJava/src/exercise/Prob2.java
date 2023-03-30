package exercise;

public class Prob2 {

	public static void main(String[] args) {
		int limit = 50;
		boolean isPrime = false;

		// 프로그램을 구현하세요.
		for (int x = 2; x <= limit; x++) {
			isPrime = true;

			for (int y = 2; y < x; y++) {
				if (x % y == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(x);
			}
		}
	}

}
