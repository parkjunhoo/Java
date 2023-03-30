package chap04.statement;

public class ForExam_Hap {

	public static void main(String[] args) {
		
		// total: 총합 , hol:홀수 합 , jjak : 짝수 합
		int total = 0;
		int hol = 0;
		int jjak = 0;
		
		// i >> 1..100 
		for(int i=1; i<=100; i++) {
			// total += i
			total += i;
			
			//홀수 이면 hol += i
			//else (짝수이면) jjak += i
			if(i%2 == 1) {
				hol += i;
			}else {
				jjak += i;
			}
			
		}
		System.out.println("총합:"+total);
		System.out.println("홀수합:"+hol);
		System.out.println("짝수합:"+jjak);
	}

}
