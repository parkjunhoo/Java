package chap04.statement;

public class MultiForExam01 {

	public static void main(String[] args) {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				if (y == 2 && x == 2) {
					System.out.print("너\t");
				} else {
					System.out.print("2\t");
				}

			}
			System.out.println();
		}

	}

}
