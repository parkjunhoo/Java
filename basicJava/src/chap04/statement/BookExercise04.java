package chap04.statement;

import java.util.Scanner;

//139페이지 7번 문제
//while문과 scanner의 nextLine() 메소드를 이용해서 다음 실행  결과와 같이 키보드로부터
//입력된 데이터로 예금, 출금 , 조회 ,종료 기능을 제공하는 코드를 작성해보세요.
public class BookExercise04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean isEnd = false;
		int balance = 0;
		
		
		while(isEnd==false)
		{
			System.out.println("--------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			int selected = s.nextInt();
			
			switch(selected) {
				case 1:{
					System.out.print("예금액>");
					int dAmount = s.nextInt();
					balance += dAmount;
					System.out.println(dAmount+"원 입금되셨습니다.");
					System.out.println("입금이 완료되어 잔고가"+balance+"원이 되었습니다.");
					break;
				}
				case 2:{
					System.out.print("출금액>");
					int wAmount = s.nextInt();
					if(wAmount > balance) {
						System.out.println("계좌에 돈이 충분하지 않습니다. 잔고:"+balance);
					}else {
						balance -= wAmount;
						System.out.println(wAmount+"원이 출금되었습니다. 잔고:"+balance);
					}
					
					break;
				}
				case 3:{
					System.out.println("잔고:"+balance);
					break;
				}
				case 4:{
					isEnd=true;
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
