package chap04.statement;

public class MultiForExam03 {

	public static void main(String[] args) {
//		for(int y=0; y<5; y++) {
//			for(int x=0; x<5; x++) {
//				if(x==y) {
//					System.out.print("*\t");
//				}else {
//					System.out.print(x+(y*5)+1+"\t");
//				}
//				
//			}
//			System.out.println();
//		}
		int num = 0;
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				if (x == y) {
					System.out.print("*\t");
				} else {
					System.out.print(num+"\t");
				}
				num++;

			}
			System.out.println();
		}
	}

}
