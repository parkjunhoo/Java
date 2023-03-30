package chap05.array;

import java.util.Scanner;

//참조형배열 만들기
public class ArrayExam03 {

	public static void main(String[] args) {
		//1. String 객체를 참조하는 변수가 저장될 배열을 만들기
		// => 5개의 요소를 만들기
		String[] strArr = {
				new String("html"),
				new String("css"),
				new String("javascript"),
				new String("jquery"),
				new String("servlet"),
				};
		
		
		// => 각 요소가 참조할 String 객체를 만들어서 할당하기
		// => String 객체를 만들때 사용할 문자열 (html,css,javascript,jquery,servlet)
		
		// => 모든 배열 요소가 참조하는 스트링객체의 문자열을 출력하기 향상된 for문
		for(String str : strArr) {
			System.out.println(str);
		}
		
		//2. Scanner객체를 참조하는 변수가 저장될 배열을 만들기
		Scanner[] sArr = {
				new Scanner(System.in),
				new Scanner(System.in),
				new Scanner(System.in),
				};
		
		for(Scanner s : sArr) {
			System.out.println(s);
		}
		
		
	}

}
