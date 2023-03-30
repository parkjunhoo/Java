package chap04.statement;

public class DoWhileTest {

	public static void main(String[] args) {
		int i = 10;
		//while문은 조건이 만족하지 않으면 블럭 안의 명령문을 한 번도 실행하지 않는다.
		while(i<10) {
			System.out.println("while처리완료");
			i++;
		}
		
		//do~while은 조건이 만족하지 않아도 한 번은 블럭안의 코드가 실행된다.
		do {
			System.out.println("dowhile처리완료"+i);
			i++;
		}while(i<20);
	}

}
