package chap05.array;

public class Array2DExam02 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int count = 1;
		for(int x = 0; x<arr.length; x++) {
			for(int y =0; y<arr[x].length; y++) {
				arr[x][y] = count++;
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}

}
