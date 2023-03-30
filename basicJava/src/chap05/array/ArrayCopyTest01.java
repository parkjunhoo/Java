package chap05.array;

public class ArrayCopyTest01 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		System.out.println("첫번째 배열 =>" + arr1);
		for(int i =0; i<arr1.length; i++) {
			arr1[i] = 10+i;
		}
		for(int i : arr1) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		int[] arr2 = new int[arr1.length * 3];
		
		
		// for문 사용 copy
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 메소드 사용 copy
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for(int i : arr2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		
		
	}

}
