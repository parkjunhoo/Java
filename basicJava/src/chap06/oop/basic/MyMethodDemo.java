package chap06.oop.basic;

public class MyMethodDemo {

	public void printGuGu(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

	public void printGuGu() {
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
			System.out.println();
		}
	}

	public int calc(int opr, int num1, int num2) {
		int result = 0;
		if (opr == 1) {
			result = num1 + num2;
		} else if (opr == 2) {
			result = num1 - num2;
		} else if (opr == 3) {
			result = num1 * num2;
		} else if (opr == 4) {
			result = num1 / num2;
		}
		return result;
	}

}
