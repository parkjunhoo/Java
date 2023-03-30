package exercise;
public class Prob10 {
	public static void main(String[] args) {
		if(args.length<1) {
			System.err.print("명령행 매개변수를 입력해주세요.");
			return;
		}
		int month = Integer.parseInt(args[0]);
		if(month < 1 || month >12) {
			//System.err.print("1~12 사이의 숫자만 입력하셔야 합니다.");
			System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
			return;
		}
		printSeason(month);
		//printSeason(month);
	}

	private static void printSeason(int month) {
		switch(month/3) {
			case 1:
				System.out.println("봄에\n태어나셨네요.");
				break;
			case 2:
				System.out.println("여름에\n태어나셨네요.");
				break;
			case 3:
				System.out.println("가을에\n태어나셨네요.");
				break;
			case 4:
			case 0:
				System.out.println("겨울에\n태어나셨네요.");
				break;
				
			
		}
	}
}
