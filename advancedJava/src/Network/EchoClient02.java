package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EchoClient02 {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			socket = new Socket(InetAddress.getLocalHost() , 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(in.readLine());
			
			String sendMsg = ""; // 서버로 보낼 메세지
			String recvMsg = ""; // 서버에서 받는 메세지
			while((sendMsg = keyin.readLine()) != null) {
				//클라 -> 서버
				out.println(sendMsg);
				//클라이언트 <- 서버
				recvMsg = in.readLine();
				System.out.println("서버>>"+recvMsg);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
