package chap05.array;
//다차원배열 -> 가변배열
//=> 다차원배열은 배열을 참조하는 배열이므로 각 배열의 요ㅗ소가 참조하는 배열의 사이즈가 달라도 된다.
public class Array2DTest03 {

	public static void main(String[] args) {
		char[][] myArr = new char[5][];
		myArr[0] = new char[1];
		myArr[1] = new char[2];
		myArr[2] = new char[3];
		myArr[3] = new char[4];
		myArr[4] = new char[5];
		//값을 할당
		for(int x = 0; x<myArr.length; x++) {
			for(int y = 0; y<myArr[x].length; y++) {
				myArr[x][y] = '*';
				//System.out.print(myArr[x][y]);
			}
			//System.out.println();
		}
		
		for(char[] charArr : myArr) {
			for(char c : charArr) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
