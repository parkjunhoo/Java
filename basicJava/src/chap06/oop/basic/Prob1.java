package chap06.oop.basic;

//배열을 메소드의 매개변수로 정의하고 사용할 수 있다.
public class Prob1 {

	public static void main(String[] args) {
		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };

		int hol = 0;
		int jjak = 0;

		Prob1 p1 = new Prob1();
		p1.calcArr("ia", ia);
		p1.calcArr("ib", ib);

		p1.getData(ia);
		
		int[] myArr = p1.getData(ia);
		for(int i : myArr) {
			System.out.println(i);
		}
	}

	public void calcArr(String name, int[] arr) {
		System.out.println("****메소드의 호출****");
		int hol = 0;
		int jjak = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				jjak += arr[i];
			} else {
				hol += arr[i];
			}
		}
		System.out.println(String.format("(배열%s)", name));
		System.out.println("홀수의합:" + hol);
		System.out.println("짝수의합:" + jjak);
	}

	// 1부터 10까지의 홀수를 리턴하는 메소드
	public int[] getData(int[] arr) {
		int[] holArr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				holArr[count] = arr[i];
				count++;
			}
		}
		int[] sliceArr = new int[count];
		System.arraycopy(holArr, 0, sliceArr, 0, count);
		return sliceArr;
	}
}
