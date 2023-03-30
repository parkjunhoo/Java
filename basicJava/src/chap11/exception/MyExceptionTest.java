package chap11.exception;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("프로그램시작");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("숫자입력:");
		int num = key.nextInt();
		//throw new Exception클래스()
		if(num%2==1) {
			try {
			throw new MyException("홀수가 입력됬습니다.(Error~~~~)");
			}catch(Exception e) {
				System.out.println("예외처리 완료");
				System.out.println("==========");
				System.out.println(e.getMessage());
			}
		}
	}

}
