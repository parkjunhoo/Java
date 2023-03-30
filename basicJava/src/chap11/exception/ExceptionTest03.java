package chap11.exception;

import java.util.Scanner;

public class ExceptionTest03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int i = 10;
		while(i <= 13) {
			int num = key.nextInt();{
				try {
					System.out.println("값"+i/num);
				}catch(ArithmeticException e) {
					System.out.println("0");
				}
			}
		}
	}

}
