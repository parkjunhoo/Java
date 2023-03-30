package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class Session {
	
	Socket skt = null;
	BufferedReader in = null;
	PrintWriter out = null;
	/*
	 * PrintWriter는 출력버퍼에 임시로 보관되어 스트림으로 출력될 떄 까지
	 * 대기중인 데이터를 스트림으로 내보내는 작업을 해야 한다.
	 * flush()를 호출해서 버퍼를 비우는 작업을 처리해야 한다.
	 * 출력 버퍼를 비우면서 실제데이터를 출력
	 */
	Runnable onConnected = null;
	
	static Vector<Session> s_sessionList = new Vector<Session>();
	
	public Session() {
		
	}
	public Session(Socket skt , Runnable onConnected) throws IOException
	{
		this.skt = skt;
		this.onConnected = onConnected;
		this.in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
		this.out = new PrintWriter(skt.getOutputStream(), true);
		if(onConnected != null) {
			this.onConnected.run();
		}
	}
	
	public Socket getSkt() {
		return this.skt;
	}
	
	public void send(String str) throws IOException{
		this.out.println(str);
	}
	
	public String read() throws IOException{
		return this.in.readLine();
	}
	
	public void close() throws IOException{
		// todo
//		skt.close();
//		in.close();
//		out.close();
	}
}
