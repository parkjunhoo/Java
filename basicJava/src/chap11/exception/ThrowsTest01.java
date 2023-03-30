package chap11.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest01 {

	//예외가 발생한 곳에서 처리하기
	//호출한 곳에서 예외가 발생된 것을 알 수 없다. 예외발생되었을때
	// 처리를 할 수 없다.
	//예외가 발생되면 예외에 대한 처리가 모두 끝난 상태로 실행됨
	public void test(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("예외처리 종료");
		}
		
	}
	
	//예외가 발생된 곳에서 처리하지 않고
	//호출한 곳에서 처리하도록 예외를 던진다.
	//메소드 선언부에 명시
	// throws 예외클래스명 , 예외클래스명2 ... {
	public void test2(String fileName) throws FileNotFoundException {
			FileInputStream fis = new FileInputStream(fileName);
	}
	public static void main(String[] args) {
		ThrowsTest01 t = new ThrowsTest01();
		//A위치에서 호출
		t.test("test2.txt");
		
		//B위치에서 호출
		t.test("dfdf");
		try {
			t.test2("Sdfsdf");
		} catch (FileNotFoundException e) {
			System.out.println("외부에서 예외처리");
		}
	}

}
