package day16_Network_TCP04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientEX {
	public static void main(String[] args) {
		
		BufferedReader br = null, stin=null;
		BufferedWriter bw = null;
		Socket client =null; //1번
		
		try {
			client = new Socket("192.168.0.31",7777);
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); //네트워크통해서 읽어옴
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputmessage;
			
			while(true) {
				System.out.println("메세지를 넣어주세요 : ");
				outputmessage = stin.readLine();
				
				if(outputmessage.equalsIgnoreCase("exit"));{
					
					bw.write(outputmessage);
					bw.flush();
					break;
				
				}
			
			}//while end
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				client.close();
			} catch (Exception e2) {
				System.out.println("서버와 채팅중 오류 발생!!!!!");
			}
		}
		
	}

}
