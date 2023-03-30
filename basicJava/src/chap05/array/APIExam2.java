package chap05.array;

import java.util.Random;
//API사용법 연습하기2
public class APIExam2 {
	public static void main(String[] args) {
		//java.util패키지의 Random클래스를 이용해서 작업하기
		// - 변수명 : rand
		Random rand = new Random();
		
		System.out.println("랜덤수:"+rand.nextInt());
		
		System.out.println("랜덤수:"+GetRandomInt(rand,1,100));
	}
	
	public static int GetRandomInt(int min , int max) {
		return new Random().nextInt(max + min + 1) + min;
	}
	
	public static int GetRandomInt(Random rand , int min , int max) {
		return rand.nextInt(max - min + 1) + min;
	}
}
