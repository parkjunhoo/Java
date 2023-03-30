package chap11.exception;
//사용자 정의 예외 클래스 만들기

public class MyException extends Exception{
	public MyException(String msg) {
		super(msg); // Exception클래스에 메세지를 전달
	}
}
