
package exercise;

public class Prob11 {
	public static void main(String[] args) {
		int num1 = 6, num2 = 15;
		System.out.println("두 수의 차는 : " + abs(num1, num2));
	}

	private static int abs(int num1, int num2)
	{
		int absInt = num1 - num2;
		return absInt > 0 ? absInt : -absInt;
	}
}

