//논리연산자 - && , || 숏컷 연산자 
package basic;
public class OprTest4
{
	public static void main(String[] args){
		int num1 = 200;
		System.out.println("작업시작");

		String str = null;
		//str.length();
		//System.out.println(num1>100 | str.length()>0);

		// || 연산자 첫번째항이 true이면 나머지 항은 검사하지 않고 넘어간다.
		System.out.println(num1>100 || str.length()>0);
		
		//&& 첫번째 항이 false면 나머지 항은 검사하지 않고 넘어간다.
		System.out.println(num1<100 && str.length()>0);

		
		System.out.println("작업종료");
		
	}
}