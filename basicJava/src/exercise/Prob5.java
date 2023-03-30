package exercise;

public class Prob5 {
	public static void main(String args[]) {
		Prob5 p5 = new Prob5();
		System.out.println(p5.gcd(2, 5));
		System.out.println(p5.gcd(5, 15));
		System.out.println(p5.gcd(250, 30));
		//System.out.println(p5.gcd(324, 132489));
	}

	public int gcd(int num1, int num2) {
		int small = PickSmall(num1, num2);
		
		int output = -1;
		
		for (int x = small; x >= 1; x--) {
			if( (num1%x==0) && (num2%x==0) ) {
				output = x;
				break;
			}
		}
		
		if (output == -1) {
			System.out.println("1로도 나눠지지 않는 수가 있다?.. == error?");
		}

		return output;
	}
	
	//두 인트 x,y중 작은값을 반환하는 메소드
	static int PickSmall(int x, int y) {

		return (x - y) < 0 ? x : y;
	}

}