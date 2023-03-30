package basic;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String line = s.nextLine();
		System.out.println(line);
	}
}
