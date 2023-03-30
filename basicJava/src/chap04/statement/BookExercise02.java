package chap04.statement;

import java.util.Random;

//138페이지 4번 while문과 random을 활용해 두개의 주사위를 던졌을때
//나오는 눈을 (눈1, 눈2)형태로 출력하고,  눈의합이 5가 아니면
//계속 주사위를 던지고 눈의 합이 5이면 실행을 멈추는 코드
//눈의 합이 5가 되는 경우 => 1,4 4,1 2,3 3,2
public class BookExercise02 {

	public static void main(String[] args) {
		Random r = new Random();
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		while(sum != 5) {
			num1 = r.nextInt(6)+1;
			num2 = r.nextInt(6)+1;
			System.out.println("("+num1+","+num2+")");
			sum = num1 + num2;
		}
		System.out.println("눈의 합이 5가 나왔습니다."+"("+num1+","+num2+")");
	}

}
