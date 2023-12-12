package day16_Network_TCP03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {  // Socket 2개 필요
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket s = null;
		
		System.out.println("Server Start!");
		try {
			ss= new ServerSocket(9000); // 포트 0~1024는 금지
			s = ss.accept(); //응답대기
			
			// I    //    O
			InputStream is = s.getInputStream();  //read
			OutputStream os = s.getOutputStream();  //write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			String message = " ☆☆☆☆☆안녕 클라이언트☆☆☆☆☆";
			os.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
