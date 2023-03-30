package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServer03 {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(12345);
			System.out.println("접속 대기중");
			while(true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getInetAddress();
				System.out.println(clientInfo.getLocalHost()+"님 접속");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());
				
				/////////
				out.println("안녕, 환영합니다."+clientInfo.getLocalHost()+"님");
				out.println("출력할 단:");
				///////////
				int dan = Integer.parseInt(in.readLine());
				for(int i =1; i<=9; i++) {
					System.out.println(dan+"*"+i+"="+(dan*i));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
