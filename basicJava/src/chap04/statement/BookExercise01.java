package chap04.statement;
//138페이지 3번 for문을 이용해서 1부터 100까지의 정수중에서 3의 배수의 총합을 출력하는 코드
public class BookExercise01 {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				total += i;
			}
		}
		System.out.println("3의 배수의 총합은:"+total);
	}

}
