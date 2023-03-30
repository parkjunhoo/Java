package data;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

//byte단위로 이력하기 위한 모든 클래스의 최상위 클래스인 InputStream
//키보드로 입력한 문자를 byte단위로 읽어서 리턴
public class InputStreamTest {

	public static void main(String[] args) {
		InputStream in = System.in;
		PrintStream out = System.out;
		try {
			while(true) {
				int data = in.read();
				if(data==13) {
					break;
				}
				out.print((char)data);
				//out.println("안녕 입력한 데이터:"+(char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}