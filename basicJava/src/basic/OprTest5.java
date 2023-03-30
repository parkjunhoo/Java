//삼항연산자 , 대입연산자
package basic;
public class OprTest5
{
	
	public static void main(String[] args){
		int num1 = 99;
		String str = "문자열";
		String result = num1 > 90 ? "합격" : "불합격";
		System.out.println(result);

		int intValResult = num1 > 90 ? 10000 : 0;
		System.out.println(intValResult);

		//대입연산자
		int i = 100;
		i%=12;
		System.out.println(i);
	}
}