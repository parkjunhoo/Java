package chap05.array;
//배열의 사용 - 1. 배열을 선언하고 생성하고 초기화하기
public class ArrayTest01 {
	
	public static void main(String[] args) {
		//1. 배열의 선언
		//	-배열의 참조할 변수를 정의하는 과정
		//	-int형의 데이터를 저장할 수있는 배열변수를 선언
		//	[형식]
		//	데이터타입[] 변수명;
		int[] myArr;
		int[] myArr2;
		//2. 배열의 생성
		//	=>실제 데이터를 저장할 수 있는 구조를 만드는 과정
		//	=>생성된 배열은 힙에 할당된다.
		//	=>힙에 할당되므로 활용하기 위해서는 변수에 대입한다.
		// 	[형식]
		//	=>new 배열에저장될데이터의타입[생성될요소의갯수]
		//int데이터가 5개 저장될 수 있는 배열을 생성 ( 5개의 요소를 갖고 있는 배열을 생성 )
		myArr = new int[5];
		myArr2 = new int[5];
		int[] myArr3 = null;
		System.out.println(myArr);
		System.out.println(myArr2);
		System.out.println(myArr3);
	}

}
