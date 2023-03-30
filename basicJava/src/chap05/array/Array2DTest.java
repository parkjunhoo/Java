package chap05.array;
//2차원배열을 정의하고 액세스 - 배열의 배열 ( 배열을 참조하는 배열 )
public class Array2DTest {

	public static void main(String[] args) {
		int [][] myArr =new int[3][2];
		myArr[0][0] = 1;
		myArr[0][1] = 2;
		myArr[1][0] = 3;
		myArr[1][1] = 4;
		myArr[2][0] = 5;
		myArr[2][1] = 6;
		
		for(int x = 0; x<myArr.length; x++) {
			for(int y = 0; y<myArr[x].length; y++) {
				System.out.print(myArr[x][y]+"\t");
			}
			System.out.println();
		}
	}

}
