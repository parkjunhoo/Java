package chap04.statement;

//for문으로 표현했던 코드를 변환해보기
// 1부터 100까지 총합 , 홀수합 , 짝수합 구해서 출력하는 코드를 while문으로 변경해보자.(제출)
public class WhileExam01 {

	public static void main(String[] args) {
		int count = 0;

		int total = 0;
		int hol = 0;
		int jjak = 0;

		while (count < 100) {
			count++;
			total += count;
			if (count % 2 == 0) {
				jjak += count;
			} else {
				hol += count;
			}
		}

		System.out.println("총합:" + total);
		System.out.println("홀수총합:" + hol);
		System.out.println("짝수총합:" + jjak);
	}

}
