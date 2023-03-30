package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MyNetServer02 {

	public static void main(String[] args) {
		Socket clientSocket = null;
		InputStream is = null; //클라이언트가 보내는 데이터를 읽기위한 스트림객체
		DataInputStream dis = null; //클라이언트가 보내는 데이터를 읽기위한 보조스트림
		
		OutputStream os = null; //클라이언트에 보낼 데이터 출력
		DataOutputStream dos = null; //클라이언트에 보낼 데이터를 출력하기위한 보조스트림
			try {
				ServerSocket server = new ServerSocket(50000);
				System.out.println("listening...");
				while(true) {
					clientSocket = server.accept();
					is = clientSocket.getInputStream();
					dis = new DataInputStream(is);
					//클라이언트에게 전송할 데이터를 보내기 위한 스트림객체를 소켓객체를 통해 생성
					os = clientSocket.getOutputStream();
					dos = new DataOutputStream(os);
					
					//서버 -> 클라 (순서 중요)
					dos.writeUTF(clientSocket.getInetAddress().getHostAddress()+"님 접속을 환영합니다");
					dos.writeInt(20000);
					
					//클라 -> 서버
					String clientMsg = dis.readUTF();
					System.out.println(clientMsg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
