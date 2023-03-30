package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//키보드로 입력한 내용을 서버에 보내기
public class EchoClient01 {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;//키보드로 입력한 데이터를 읽기 위한 스트림
		
		try {
			socket = new Socket(InetAddress.getLocalHost() , 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg = ""; // 서버로 보낼 메세지
			String recvMsg = ""; // 서버에서 받는 메세지
			while((sendMsg = keyin.readLine()) != null) {
				//클라 -> 서버
				out.println(sendMsg);
				//클라이언트 <- 서버
				recvMsg = in.readLine();
				System.out.println("서버>>"+recvMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
