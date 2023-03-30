package chap04.statement;

public class GuGuExam_Break {
	
	public static void main(String[] args) {
		for(int x=2; x<=9; x++) {
			//if(x==5) break;
			for(int y=1; y<=9; y++) {
				if(x==5) break;
				System.out.print(x+"*"+y+"="+y*x+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("====================");
		
		for(int y=1; y<=9; y++) {
			for(int x=2; x<=9; x++) {
				System.out.print(x+"*"+y+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

}
