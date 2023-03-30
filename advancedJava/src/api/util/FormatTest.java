package api.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//출력되는 숫자와 날짜에 포맷을 적용할 수 있다.
// => 지정한 패턴에 맞게 출력
public class FormatTest {

	public static void main(String[] args) {
		//날짜 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal = Calendar.getInstance();
		//날짜 객체에 SimpleDateFormat에 정의한 패턴을 적용
		
		String data = sdf.format(cal.getTime());
		System.out.println("format을 적용한 날짜 데이터=>"+data);
		
		//숫자출력
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(12345));
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		
		System.out.println(df2.format(12345.1234));
		
		String d = "123456.678";
		try {
			double num = (double)df2.parse(d);
			System.out.println(df2.format(num));
		}catch(ParseException e) {
			
		}
		
		
		
	}

}
