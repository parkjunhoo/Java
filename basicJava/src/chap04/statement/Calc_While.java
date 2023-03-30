package chap04.statement;

import java.util.Scanner;

public class Calc_While {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean isExit = false;
		while(true)
		{
			System.out.println("*******미니계산기*******");
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("3. 빼기");
			System.out.println("4. 나누기");
			System.out.println("5. 종료");
			System.out.print("연산자를 선택하세요");
			int oper = s.nextInt();
			if(oper==5) {
				break;
			}
			System.out.print("숫자를 입력하세요");
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			int result = 0;
			
			// 1=더하기 , 2=곱하기 , 3=빼기 , 4=나누기
			if (oper == 1) {
				result = num1 + num2;
			} else if (oper == 2) {
				result = num1 * num2;
			} else if (oper == 3) {
				result = num1 - num2;
			} else if (oper == 4) {
				result = num1 / num2;
			}
	
			System.out.println("계산결과=>" + result);
			System.out.println("=============================");
			
		}

	}

}
