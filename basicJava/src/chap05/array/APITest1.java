package chap05.array;

import java.util.Random;
import javax.swing.JFrame;

//API 사용 방법
// -> API에서 제공하는 클래스를 메모리에 올리고 사용하는 방법
// -> API는 패키지로 구분되어 있다.
// -> API의 기본 패키지는 java.lang 패키지
// -> 나머지 패키지는 import 패키지명; 으로 인식 시켜야한다.
public class APITest1 {

	public static void main(String[] args) {

		String str = new String("문자열");
		char a = str.charAt(0);
		
		//StringBuffer클래스를 메모리에 할당하고 할당된 StringBuffer클래스의 메소드를 호출
		StringBuffer sb = new StringBuffer();
		
		//Integer클래스를 메모리에 할당하고 할당된 Integer클래스의 메소드를 호출
		Integer in = new Integer(10);
		
		//Thread클래스를 메모리에 할당하고 할당된 Thread클래스의 메소드를 호출
		Thread th = new Thread();
		
		
		//Random클래스를 메모리에 할당하고 할당된 Random클래스의 메소드를 호출
		Random r = new Random();
		
		//JFrame클래스를 메모리에 할당하고 할당된 JFrame클래스의 메소드를 호출
		JFrame frame = new JFrame();
		frame.setSize(400,500);
		frame.setVisible(true);
	}

}
