package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedRead와 같은 보조스트림은 실제 데이터소스(파일,키보드입력,소켓)
//와 직접 연결이 불가능
//실제 데이터 소스와 연결되는 스트림객체를 생성한 후에 보조스트림객체를 만들어야한다.
public class BufferedReaderTest {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src/data/InputStreamTest.java"));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		long start = System.nanoTime();
		while((line = br.readLine()) != null) {
			//System.out.println(arr);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
	}

}
