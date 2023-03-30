//논리연산자 - &(and) , |(or)
package basic;
public class OprTest3
{
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 200;
		
		//&연산자(and)
		//true&true
		System.out.println((num1<num2) && (num1>=100));
		//true&false
		System.out.println((num1<num2) && (num1>100));

		//false&true
		System.out.println((num1>num2) && (num1>=100));
		//false&false
		System.out.println((num1>num2) && (num1>=300));

		System.out.println();
		//|연산자(or)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println();
		//!연산자(not)
		System.out.println(true);
		System.out.println(!true);

	}
}