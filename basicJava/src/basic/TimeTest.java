// TimeTest.java작성하기
// int형 변수를 선언하고 8800을 할당하기
// 8800이 초 데이터라 가정하고 시분초로 표현해보자.
// 출력형태 : ___시 __분 __초

package basic;

public class TimeTest
{
	public static void main(String[] args){
		int sec = 8800;

		int hour = sec / 3600;
		sec =sec % 3600;

		int min = sec / 60;
		sec =sec % 60;

		System.out.println(hour+"시 "+min+"분 "+sec+"초");
	}
}