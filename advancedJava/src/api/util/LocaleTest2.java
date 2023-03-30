package api.util;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
//사용 언어별로 다른 리소스를 설정하기 위해서 필요한 객체
public class LocaleTest2 {
	public static void main(String[] args) {
		Locale locale = new Locale.Builder()
				.setLanguage("en")
				.setRegion("US")
				.build();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		
		Locale locale2 = new Locale.Builder()
				.setLanguage("ko")
				.setRegion("KR")
				.build();
		
		System.out.println(locale2.getLanguage());
		System.out.println(locale2.getCountry());
		
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getDisplayName(Locale.CHINESE));
		
		Calendar cal1 = Calendar.getInstance(locale);
		cal1.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println(cal1.getTimeZone());
		TimeZoneTest.getInfo(cal1);
		
		
	}
}
