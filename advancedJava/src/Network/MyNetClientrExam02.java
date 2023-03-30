package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MyNetClientrExam02 {

	public static void main(String[] args) {
		Socket skt = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			skt = new Socket(InetAddress.getLocalHost() , 12345);
			in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			out = new PrintWriter(skt.getOutputStream(),true);
			
			String data1 = in.readLine();
			System.out.println(data1);
			
			int dan = Integer.parseInt(in.readLine());
			for(int i =1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
			
			String sendData = (dan%2==0) ? "짝수" : "홀수";
			out.println(sendData);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
