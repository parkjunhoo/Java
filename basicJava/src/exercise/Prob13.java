package exercise;


import java.util.Scanner;

public class Prob13 {
	
	public static void main(String args[]) {
		
		int start = 0 ;
		int end = 0;
		int step = 0 ;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.print("초기 값을 정수로 입력하세요. : ");
		start = CatchNextIntError(keyboard);
		System.out.print("마지막 값을 정수로 입력하세요. : ");
		end = CatchNextIntError(keyboard);
		System.out.print("증가분을 정수로 입력하세요. : ");
		step =  CatchNextIntError(keyboard);
		
		
		/*  이곳에 프로그램을 완성하십시오. */	
		for(int i=start; i<=end; i+=step) {
			sum += i;
		}
		sum += sum>1000 ? 2000 : 0;
		 
		System.out.println("총합은 " + sum +" 입니다. ");
	}
	
	static int CatchNextIntError(Scanner s) {
		try {
			return s.nextInt();
		}catch(Exception e) {
			System.out.println("잘못된 값 입니다.");
			System.exit(0);
		}
		return -1;
	}
	
}

