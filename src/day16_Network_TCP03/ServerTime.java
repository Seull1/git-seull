package day16_Network_TCP03;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {
	public static void main(String[] args) {
		int port = 7777;
		
		try {
			System.out.println("서버가 시작했습니다...");
			ServerSocket ss = new ServerSocket(port);
			
			while(true) {
				Socket s = ss.accept();
				
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());
				oos.flush();  //버퍼 비우기
				s.close();
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
