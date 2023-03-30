package Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient01 {

	public static void main(String[] args) {
		
		try {
			Socket client = new Socket(InetAddress.getLocalHost(), 7777);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
