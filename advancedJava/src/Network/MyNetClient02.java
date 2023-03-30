package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient02 {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		//서버에 접속
		try {
			socket = new Socket(InetAddress.getLocalHost() , 50000);
			//서버가 보내는 데이터를 읽기 위한 스트림
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			//서버에 보낼 데이터를 쓰기 위한 스트림
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			String msg = dis.readUTF();
			System.out.println("서버가 전송한 데이터1:"+msg);
			int num = dis.readInt();
			System.out.println("서버가 전송한 데이터2:"+num);
			
			//클라 -> 서버
			dos.writeUTF("안녕하세요 서버님 클라에요.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
