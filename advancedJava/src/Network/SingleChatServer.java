package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ServerSendThread extends Thread{
	Socket socket;
	PrintWriter out;
	BufferedReader keyin;
	
	String sendMsg = "";
	
	public ServerSendThread() {
		
	}
	
	public ServerSendThread(Socket socket) {
		this.socket = socket;
		try {
			out = new PrintWriter(socket.getOutputStream(),true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				if((sendMsg = keyin.readLine()) != null) {
					out.println(sendMsg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class ServerReceiverThread extends Thread{
	Socket socket;
	BufferedReader in;
	
	String recvMsg = "";
	
	public ServerReceiverThread() {
		
	}
	
	public ServerReceiverThread(Socket socket) {
		this.socket = socket;
		try {
			this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while(true) {
			try {
				recvMsg = in.readLine();
				if(recvMsg != null) System.out.println("클라>>"+recvMsg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class SingleChatServer {

	public static void main(String[] args) {

			ServerSocket server = null;
			Socket socket = null;
			ServerSendThread sst = null;
			ServerReceiverThread srt = null;
		
			try {
				server = new ServerSocket(12344);
				socket = server.accept();
				
				sst = new ServerSendThread(socket);
				srt = new ServerReceiverThread(socket);
				sst.start();
				srt.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
