package chap05.array;

import java.util.ArrayList;

//메소드를 활용한 Array Copy
public class ArrayCopyTest02 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = new int[arr1.length*2];
		
		//System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.arraycopy(arr1, 3, arr2, 2, arr1.length-3);
		
		for(int i : arr2) {
			System.out.print(i+"\t");
		}

	}
}
