package chap06.oop.basic;
//문자열을 숫자로 변경하는 방법
//Integer클래스를 parseInt메소드를 이용하면 String데이터를 int데이터로
//변경할 수 있다.
public class IntegerTest {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);

	}

}
