package exercise;

public class Prob12 {
	public static void main(String args[]) {
		// 구현하시오.
		int[] arr = { 3 , 24 , 1 , 55 , 17 , 43 , 5 };
		//		  --
		//{ 1, 3, 24, 55, 17, 43, 5 }
		//{ 1, 3, 5, 17, 43, 24, 55 }
		
		int smallerTemp = 0;
		for(int x = 0; x<arr.length; x++) {
			smallerTemp = arr[x];
			for(int y =x+1; y <arr.length; y++) {
				
				if(smallerTemp > arr[y]) {
					smallerTemp = arr[y];
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
			System.out.println(smallerTemp);
		}
	}
}
