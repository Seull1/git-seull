package day17_Network_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import day14_io_fileCopy.DataoutputStreamTest;

public class tcpChatClient {
	public static void main(String[] args) {
		
		if(args.length !=1) {
			System.out.println("닉네임을 입력하고 오세요..");
			System.exit(0);
		}
		
		try {
			String ip="192.168.0.31";
			Socket s = new Socket(ip,7777);
			System.out.println("연결 됬습니다");
			Thread sender = new Thread(new ClientSender(s,args[0]));
			Thread receiver = new Thread(new ClientReceiver(s));
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}//main() end
	
	static class ClientSender extends Thread{//inner class
		Socket s;
		DataOutputStream dos;
		String name;
		

		public ClientSender(Socket s ,String name) {
			this.s =s;
			
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); //키보드로 입력받기
			
			try {
				if(dos != null) dos.writeUTF(name);
				while(dos != null) dos.writeUTF("[" +name+"]" + sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			super.run();
		}
		
		
	}// ClientSender end
	
	
	
	
	static class ClientReceiver extends Thread{  //inner class
		Socket s;
		DataInputStream dis;
		
		public ClientReceiver(Socket s) {
			this.s =s;
			
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while(dis != null) {
				
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}//ClientReceiver end
	
	
}
