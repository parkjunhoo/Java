package Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Connector{
	
	Socket skt = null;
	
	public Socket getSkt() {
		return this.skt;
	}
	public Connector() {
		
	}
	
	public Connector(Socket skt) {
		this.skt = skt;
	}
	
	public Connector(InetAddress ipAddr , int port) throws IOException {
		this(new Socket(ipAddr , port));
	}
}
