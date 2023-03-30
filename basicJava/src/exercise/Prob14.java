package exercise;

public class Prob14 {
	public static void main(String[] args) {
		int year = 2010;
		int month = 2;
		int maxDay = 0;
		
		
		final int NORM_LASTDAY = 28;
		final int YOON_LASTDAY = 29;

		/* 이 부분을 작성하세요 */
		
		maxDay = NORM_LASTDAY;
		boolean con1 = year%4==0; 		//  4의 배수인가?
		boolean con2 = year%100==0; 	//	100의 배수인가?
		boolean con3 = year%400==0; 	//	400의 배수인가? 
		
		if( (con1 && !con2) || (con2 && con3)) {
			maxDay = YOON_LASTDAY;
		}
		
		System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다");
	}
}

