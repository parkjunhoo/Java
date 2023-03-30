package Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest01 {

	public static void main(String[] args) {
		try {
			//URL url = new URL("https://mblogthumb-phinf.pstatic.net/20141006_11/botos__1412576640734ir7F3_JPEG/002.jpg?type=w2");
			URL url = new URL("https://www.naver.com");
			System.out.println(url.getFile());
			//getPort -1 => 프로토콜에 등록되어 있는 기본 포트로 접속
			//http프로토콜의 기본 port = 80;
			
			//지정한 url에 접속해서 해당 자원을 읽는 작업을 수행
			//input은 bufferedReader
			
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			
		}
	}

}
