package chap05.array;

import java.util.Random;

public class ArrayExam02 {
//배열연습 
	public static void main(String[] args) {
		//1부터 100까지의 랜덤수가 배열에 저장될 수 있도록 작성하기
		//int형 배열 (요소 5개)
		//배열에 저장된 데이터를 액세스 해서 다음과 같이 작업하기
		//[출력형식]
		//0번요소 -> _____(짝수 | 홀수)
		//1번요소 -> _____(짝수 | 홀수)
		Random r = new Random();
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
			String str = arr[i]%2==0 ? "(짝수)" : "(홀수)";
			System.out.println(i+"번요소 ->"+arr[i]+str);
			
		}
		
	}

}
