package chap06.oop.basic;

//미니계산기 - if문

public class Calc {
	public static void main(String[] args) {
		MyMethodDemo mmd = new MyMethodDemo();
		int result = mmd.calc(1,5,5);
		System.out.println(result);
	}
}
