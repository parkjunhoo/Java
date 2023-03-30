package chap05.array;

import java.util.Random;


//배열의 사용 -1. 배열을 선언하고 생성하고 초기화하기
public class ArrayTest02 {

	public static void main(String[] args) {
		int[] myArr = new int[3];
		double[] myArr2 = new double[5];
		boolean[] myArr3 = new boolean[2];
		char[] myArr4 = new char[5];
		String[] myArry5 = new String[10];
		Random[] myArry6 = new Random[100];
		
		//배열변수는 초기값이 자동으로 할당된다.
		
		//3. 배열의 초기화
		// => 배열의 각 요소에 값을 할당한다.
		myArr[0] =100;
		myArr[1] =200;
		myArr[2] =300;
		System.out.println(myArr[0]);
		System.out.println(myArr[1]);
		System.out.println(myArr[2]);
		//액세스 할 수 있는 배열 요소의 범위를 벗어나면 Exception이 발생한다.
	}

}