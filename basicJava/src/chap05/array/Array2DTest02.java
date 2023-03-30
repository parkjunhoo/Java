package chap05.array;
//2차원배열의 활용
public class Array2DTest02 {

	public static void main(String[] args) {
		//1. 2학급의 국어,수학,영어 점수를 저장할 배열을 만들고 값을 저장하기
		
		int[][] scores = {
			{90,89,100},
			{97,89,97},
		};
		
		final double subjectOffset = scores[0].length;
		
		//A반 - 90,89,100
		//B반 - 97,89,97
		int[] allTotals = new int[2];
		//2. 저장된 배열의 모든 값을 출력하기.
		//단 각 과목의 점수와 전체 평균 출력하기
		int korTotal = 0;
		int mathTotal = 0;
		int engTotal = 0;
		
		for(int x = 0; x<scores.length; x++) {
			for(int y = 0; y<scores[x].length; y++) {
				allTotals[x] += scores[x][y];
				if(y==0) korTotal += scores[x][y];
				if(y==1) mathTotal += scores[x][y];
				if(y==2) engTotal += scores[x][y];
			}
		}
		
		System.out.println("모든학급 국어 점수합:"+korTotal);
		System.out.println("모든학급 수학 점수합:"+mathTotal);
		System.out.println("모든학급 영어 점수합:"+engTotal);
		
		System.out.println("모든학급 국어 평균:"+korTotal/(double)scores.length);
		System.out.println("모든학급 수학 평균:"+mathTotal/(double)scores.length);
		System.out.println("모든학급 영어 평균:"+engTotal/(double)scores.length);
		
		for(int i =0; i<scores.length; i++) {
			System.out.println((i+1)+"반"+"전체 3과목 평균"+allTotals[i]/subjectOffset);
		}
		
	}

}
