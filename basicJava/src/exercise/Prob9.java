package exercise;

import java.util.Scanner;

import java.util.Scanner;

public class Prob9 {
 
	public static void main(String[] args) {
		int number = 0; 

		Scanner keyboard = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. : ");
		try {
			number = keyboard.nextInt();
		}catch(Exception e) {
			System.out.println("잘못된 값 입니다.");
		}
		
		//프로그램을 구현하세요.
		for(int x=number; x>=1; x--) {
			for(int y = x; y>=1; y--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
