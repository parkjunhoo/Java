package chap05.array;
// 배열을 액세스 하기 
public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[] myArr = new int[5];
//		myArr[0] = 20;
//		myArr[4] = 100;
//		
//		//배열의 요소의 갯수
//		//System.out.println(myArr.length);
//		// ==> for문을 이용해서 배열에 저장된 값을 읽어오기
//		
//		for(int i =0; i<myArr.length; i++) {
//			System.out.println(myArr[i]);
//		}
//		System.out.println("=================");
//		for(int num : myArr) {
//			System.out.println(num);
//		}
		
		//for 문을 이용해서 배열요소에 100을 할당
		for(int i =0; i<myArr.length; i++) {
			myArr[i] = 100;
			System.out.println(myArr[i]);
		}
		
	}

}
