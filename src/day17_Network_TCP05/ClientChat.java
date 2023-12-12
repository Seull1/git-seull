package day17_Network_TCP05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {
	public static void main(String[] args) throws IOException { 
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br
		      = new BufferedReader(new InputStreamReader(System.in)); //키보드로 입력받기
		
		ps.print("접속할 서버 ip ==> "); 		ip = br.readLine(); //192.168.0.31
		ps.print("전송할 메세지  ==> "); 		str = br.readLine(); // 문자열
		
		
		byte[] buffer = str.getBytes("euc-kr");
		String message = new String(buffer, "euc-kr");
		
		Socket  client = new Socket(ip, port);  // server ip /port number socket create 
		OutputStream os = client.getOutputStream(); //��Ʈ��ũ�� ip ���ؼ� ����,...
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(message, 0, message.length());
		//bw.write(str, 0, message.length());
		bw.flush();  
		
		bw.close();		client.close();
		ps.println(ip + " 에서 메세지 전송 성공~~");
		ps.close();
	}
}
