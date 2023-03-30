package chap05.array;

import java.util.Random;

//참조형배열
public class ArrayTest05 {

	public static void main(String[] args) {
		String[] strArr = new String[3];
		
		//System.out.println(strArr);
		//참조형배열변수의 초기값은 null
		//System.out.println(strArr[0]);
		
		strArr[0] = new String("java");
		strArr[1] = new String("mysql");
		strArr[2] = new String("jdbc");
		
		//향상된 for문 - 자료구조에서 데이터를 꺼내는 작업을 편하게 할 수 있도록 jdk5.0이후에 추가된 for문
		//for(데이터타임 변수 : 배열변수){
		//	  ------
		//	   배열의 타입 ( 배열 요소에 할당된 데이터의 타입)
		//}
		for(String data : strArr) {
			System.out.println(data);
		}
		
		Random[] randArr = new Random[3];
		randArr[0] = new Random();
		randArr[1] = new Random();
		randArr[2] = new Random();
		
		for(Random rand : randArr) {
			System.out.println(rand);
		}
		
		
	}

}
