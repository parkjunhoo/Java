package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

class ClientSendThread implements Runnable {
	Socket socket;
	PrintWriter out;
	BufferedReader keyin;

	String sendMsg = "";

	public ClientSendThread() {

	}

	public ClientSendThread(Socket socket) {
		this.socket = socket;
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				if ((sendMsg = keyin.readLine()) != null) {
					out.println(sendMsg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class ClientReceiverThread implements Runnable {
	Socket socket;
	BufferedReader in;

	String recvMsg = "";

	public ClientReceiverThread() {

	}

	public ClientReceiverThread(Socket socket) {
		this.socket = socket;
		try {
			this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				recvMsg = in.readLine();
				if (recvMsg != null)
					System.out.println("서버>>" + recvMsg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

public class SingleChatClient {

	public static void main(String[] args) {

		Socket socket;
		Thread cst = null;
		Thread crt = null;
		try {
			socket = new Socket(InetAddress.getLocalHost(),12344);
			
			cst = new Thread(new ClientSendThread(socket));
			crt = new Thread(new ClientReceiverThread(socket));
			cst.start();
			crt.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
