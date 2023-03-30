package chap05.array;
//배열의 선언과 생성고 초기화를 한 번에 작업하기
public class ArrayTest04 {

	public static void main(String[] args) {
		//타언어에서 주로 쓰는 방식 ,로 구분된 요소에 저장된다.
		int[] myArr = {0,1,2,3,4};
		for(int i : myArr) {
			System.out.println(i);
		}
		
		//자바답게 
		int[] myArr2 = new int[] {2,2,2,2,2};
		
	}

}
