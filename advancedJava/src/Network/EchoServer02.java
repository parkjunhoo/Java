package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EchoServer02 {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			server = new ServerSocket(12345);
			System.out.println("대기");
			while (true) {
				socket = server.accept();
				InetAddress clientInfo = socket.getLocalAddress();
				System.out.println(clientInfo.getHostAddress());
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);

				out.println("안녕하세요 클라이언트님?");

				String reMsg = "";
				while (true) {
					reMsg = in.readLine();
					if (reMsg == null) {
						System.out.println("sdfsdf");
						break;
					}
					switch (reMsg) {
					case "안녕하세요?":
					case "하이":
						out.println(clientInfo.getHostAddress() + "님 반가워요");
						break;
					case "오늘 날짜는":
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
						Calendar cal = Calendar.getInstance();
						out.println(sdf.format(cal.getTime()));
						break;

					default:
						out.println(clientInfo.getHostAddress() + "님 어여 가~~");
					}

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
