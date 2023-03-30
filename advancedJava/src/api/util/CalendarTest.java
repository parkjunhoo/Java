package api.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar();
		Calendar c2 = Calendar.getInstance();
		
		System.out.println(c);
		System.out.println(c2);
		
		Date d = new Date();
		System.out.println(d);
		System.out.println("=====Calendar객체의 사용방법=====");
		System.out.println(c.get(Calendar.YEAR));	
		System.out.println(c.get(Calendar.MONTH)+1);	
		System.out.println(c.get(Calendar.DATE));	
		System.out.println(c.get(Calendar.HOUR));	
		System.out.println(c.get(Calendar.MINUTE));	
		System.out.println(c.get(Calendar.SECOND));	
		
		c.set(2013,8,5);
		System.out.println(c.get(Calendar.YEAR));	
		System.out.println(c.get(Calendar.MONTH)+1);	
		System.out.println(c.get(Calendar.DATE));	
		System.out.println(c.get(Calendar.HOUR));	
		System.out.println(c.get(Calendar.MINUTE));	
		System.out.println(c.get(Calendar.SECOND));	
		
		System.out.println(c.getTimeInMillis());//셋팅된 날짜시간객체의 값을 미리세컨드로 반환
		
		System.out.println("==================");
		//오늘부터 6/18일까지 dday를 계산해보기
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 5, 18);
		cal.getTimeInMillis();
		Calendar cal2 = Calendar.getInstance();
		long z = cal.getTimeInMillis() - cal2.getTimeInMillis();
		System.out.println("남은일수:"+z/1000/60/60/24);
		
		
		
	}

}
