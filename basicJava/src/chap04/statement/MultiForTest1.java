package chap04.statement;

//for문 중첩해서 사용하기
public class MultiForTest1 {

	public static void main(String[] args) {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				if (y == 2 && x == 2) {
					System.out.print("너");
				} else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}

}
