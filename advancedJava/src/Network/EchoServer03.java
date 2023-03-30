package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoServer03 {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;//키보드로 입력한 데이터를 읽기 위한 스트림
		
		
		try {
			server = new ServerSocket(6123);
			socket = server.accept();
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg = ""; // 보낼 메세지
			String recvMsg = ""; // 받는 메세지
			while(true) {
				recvMsg = in.readLine();
				if(recvMsg == null) break;
				System.out.println("클라>>"+recvMsg);
				
				if((sendMsg = keyin.readLine()) != null) {
					out.println(sendMsg);
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
