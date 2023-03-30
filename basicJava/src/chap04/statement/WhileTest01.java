package chap04.statement;
//자바프로그래밍 5번 출력
public class WhileTest01 {

	public static void main(String[] args) {
		int count =0;
		//while 문은 주로 실행 결과가 true/false인 메소드를 호출하여 작업하는 경우 사용
		while(count < 5) {
			System.out.println("자바프로그래밍");
			count++;
		}
		
		System.out.println();
		
		count = 1;
		while(true) {
			System.out.println("자바프로그래밍");
			if(count == 5) break;
			count++;
			
		}
	}

}
