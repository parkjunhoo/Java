//산술연산자 확인하기
package basic;
public class OprTest1{
	public static void main(String[] args){
		/*
		int num1 = 100;
		int num2 = 30;
		// + 연산자
		int result = num1 + num2;
		System.out.println("더한 결과=>"+result);

		// - 연산자
		result = num1 - num2;
		System.out.println("뺀 결과=>"+result);

		//  * 연산자
		result = num1 * num2;
		System.out.println("곱한 결과=>"+result);

		//    / 연산자
		result = num1 / num2;
		System.out.println("나눈(몫) 결과=>"+result);

		//   % 연산자
		result = num1 % num2;
		System.out.println("나눈(나머지) 결과=>"+result);
		*/

		//단항연산자 x ++
		int x = 5;
		int y = x++;
		System.out.println("x++ Y값은:"+y);

		//단항연산자 ++ x
		x = 5;
		y = ++x;
		System.out.println("++x Y값은:"+y);

		//단항연산자  x  --
		x = 5;
		y = x--;
		System.out.println("x-- Y값은:"+y);

		//단항연산자 -- x
		x = 5;
		y = --x;
		System.out.println("--x Y값은:"+y);
		
	}
}