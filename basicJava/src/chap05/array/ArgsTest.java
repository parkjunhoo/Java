package chap05.array;

public class ArgsTest {

	public static void main(String[] args) {
		//명령행 매개변수
		// 프로그램이 실행될떄 외부에서 값을 입력 받아 사용할 수 있도록 지원
		// 프로그램 실행하면서 값을 입력하면 인터프리터가 몇 개를 입력했는지 확인하고 갯수만큼 String배열을 만들어준다.
		for(String str : args) {
			System.out.println("명령행매개변수=>"+str);
		}
		
	}

}
