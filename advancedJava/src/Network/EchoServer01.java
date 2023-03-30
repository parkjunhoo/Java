package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//키보드로 입력한 내용을 클라이언트가 보내오면 데이터를 지속적으로 읽어서
//클라이언트에게 다시 보내주는 작업
public class EchoServer01 {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(12345);
			System.out.println("대기...");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getHostAddress()+"님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());
				//클라가 보내는 데이터를 계속 읽어서 클라에게 다시 보냄
				String recvMsg = ""; //클라이언트가 보내오는 데이터 저장
				while(true) {
					//서버 <- 클라
					recvMsg = in.readLine();
					if(recvMsg == null) break;
					System.out.println("클라>>"+recvMsg);
					//서버 -> 클라
					out.println(recvMsg+"^^");
				}
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
