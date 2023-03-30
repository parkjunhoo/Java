package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient03 {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;//키보드로 입력한 데이터를 읽기 위한 스트림
		
		try {
			socket = new Socket(InetAddress.getLocalHost() , 12344);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg = ""; // 보낼 메세지
			String recvMsg = ""; // 받는 메세지
			while((sendMsg = keyin.readLine()) != null) {
				out.println(sendMsg);
				
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
