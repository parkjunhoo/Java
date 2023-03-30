package chap04.statement;

public class ForTest2 {

	public static void main(String[] args) {
		//다음과 같은 조건을 만족할 수 있도록 작업
		//for을 10번 실행
		//홀수번째는 **************
		//짝수번쨰는 ==============
		//초기화 변수를 여러개 정의 가능.
		for(int i=1, j=10; i<=10 && j<=15; i++ , j++) {
			if(i%2==0) { 
				System.out.println("==============" + i +" "+ j);
			}else {
				System.out.println("**************" + i +" "+ j);
			}
		}
	}

}
