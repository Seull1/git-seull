package day16_Network_TCP04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEX {
	public static void main(String[] args) {
		
		BufferedReader br = null, stin=null;
		BufferedWriter bw = null;
		ServerSocket server = null; //1번
		Socket client =null; //2번
		System.out.println("연결됨.... 김민성의 서버입니다~~");
		
		try {
			server = new ServerSocket(7777);
			client =server.accept();//응답대기
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); //네트워크통해서 읽어옴
			//키보드 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			
			//클라이언트 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputmessage;
			
			while(true) {
				inputmessage=br.readLine()	;
				
				if(inputmessage.equalsIgnoreCase("exit")) break;  //대소문자 구분X 
				System.out.println(inputmessage); //클라이언트가 보낸 메세지 화면 출력
				
				String outputmessage = stin.readLine();//키보드에서 한 행의 문자열 읽음
				//키보드에서 읽은 무자열 전송
				bw.write(client.getInetAddress() + "서버 > " +outputmessage + "\n");
				bw.flush();
			}//while end
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				client.close();
//				server.close();
				
			} catch (Exception e2) {
				System.out.println("클라이언트와 채팅중 오류 발생!!!!!");
			}
		}
	}

}
