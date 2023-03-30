package chap05.array;

public class ArrayExam04 {
	public static void main(String[] args) {

		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };

		int hol = 0;
		int jjak = 0;

		for (int i : ia) {
			if (i % 2 == 0) {
				jjak += i;
			} else {
				hol += i;
			}
		}
		System.out.println("( 배열 ia)");
		System.out.println("( 홀수의 합 : )"+hol);
		System.out.println("( 짝수의 합 : )"+jjak);
		
		hol = 0;
		jjak = 0;
		
		for (int i : ib) {
			if (i % 2 == 0) {
				jjak += i;
			} else {
				hol += i;
			}
		}
		System.out.println("( 배열 ib)");
		System.out.println("( 홀수의 합 : )"+hol);
		System.out.println("( 짝수의 합 : )"+jjak);

	}
}
