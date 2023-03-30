package chap04.statement;

import java.util.Random;

//if문 연습
public class ifTest01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		
		System.out.println(num);
		if(num>90) {
			System.out.println("테스트 작업 완료");
			System.out.println("처리 진행");
		}
		System.out.println("종료");
	}

}
