package chap05.array;
//Scanner를 이용해서 작업
//숫자 두 개를 Scanner를 이용해서 입력 받고
//1. kor, eng , math 변수를 선언하고 Scanner를 이용해서 입력 받아 값을 할당하기
//2. 이 변수에 저장된 값을 이용해서 아래와 같은 출력 결과가 나타나도록 프로그램을 작성하세요.

//총점:
//평균:
import java.util.Scanner;

public class APIExam3_Scanner {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
//		int kor = 0,eng = 0,math = 0;
//			
//		System.out.println("국어 점수를 입력하세요.");
//		kor = key.nextInt();
//		
//		System.out.println("영어 점수를 입력하세요.");
//		eng = key.nextInt();
//		
//		System.out.println("수학 점수를 입력하세요.");
//		math = key.nextInt();
//		
//		int sum = kor + eng + math;
//		float avg = sum / 3f;
//		System.out.println("총점:"+sum);
//		System.out.println("평균:"+avg);
//		
//		key.close();
		
		System.out.print("국어:");
		int kor = key.nextInt();
		System.out.print("영어:");
		int eng = key.nextInt();
		System.out.print("수학:");
		int math = key.nextInt();
		
		int sum = kor + eng + math;
		float avg = sum / 3f;
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		
		key.close();
	}

}
