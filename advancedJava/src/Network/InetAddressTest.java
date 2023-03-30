package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		try {
			InetAddress ipAddr = InetAddress.getByName(args[0]);
			System.out.println(ipAddr.getHostName());
			System.out.println(ipAddr.getHostAddress());
			System.out.println(InetAddress.getLocalHost());
			
			System.out.println("======================");
			InetAddress[] ipAddrs = InetAddress.getAllByName(args[0]);
			for(InetAddress ia : ipAddrs) {
				System.out.println(ia.getHostName());
				System.out.println(ia.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
