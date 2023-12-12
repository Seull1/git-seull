package day17_Network_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

//collection , thread , io ,basic java
public class tcpChatServer { //outer class
	HashMap clients ;    //key,value
	
	public tcpChatServer() {  //생성자 함수
		clients = new HashMap(); //HashMap 객체 생성
		Collections.synchronizedMap(clients); // 클라이언트를 기준으로 동기화
		
	}
	
	public void start() { //user mathod
		ServerSocket ss = null; //서버소캣1
		Socket s = null;// 클라소캣2
		
		try {
			ss= new ServerSocket(7777);
			System.out.println("서버가 시작 되었습니다.. 준비완료");
			while(true) {
				s= ss.accept();//응답대기 ,클라이언트 소캣
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속했습니다");
				ServerReciver thread = new ServerReciver(s);
				thread.start();
				
				
			}
			
		} catch (Exception e) {  e.printStackTrace();
		}
		
	}
	
	public void sendToAll(String msg) {
		Iterator it =clients.keySet().iterator(); //key값 출력
		
		while(it.hasNext()) {
			
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());  //해당 키 값으로 value값 출력
//				System.out.println("dos.toString() : "+dos.toString());
				dos.writeUTF(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//sendToAll end
	
	
	
	class ServerReciver extends Thread{  //inner class
		Socket s;
		DataInputStream dis;  //readXXX() 함수있다 -xxx는 자료형
		DataOutputStream dos;  //writeXXX(); 멤버범수의 초기화 담당
		
		public ServerReciver(Socket s) {
			this.s =s;
			try {
				dis = new DataInputStream(s.getInputStream());//네트워크를 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); //네트워크를 통해서 쓰기
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}

		@Override  ///thread 쓸때는 run()메소드를 오버라이드 해야한다
		public void run() {  //스레드 실행부(구현부)
			String name="";
			try {
				name = dis.readUTF();
				sendToAll("#"+name+" 님이 입장하셨습니다~~");
				
//				System.out.println(dos.toString().hashCode());
				clients.put(name, dos); //HashMap 넣기
				System.out.println("현재 서버 접속자 수는 : "+clients.size()+ " 명 입니다.");//접속자 수 확인
				
				while( dis != null) {
					sendToAll(dis.readUTF());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				sendToAll("#"+name+" 님이 나갔습니다");
				clients.remove(name);  //접속자 수 제거하기
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속 종료했습니다");
				System.out.println("현재 서버 접속자 수는 : "+clients.size()+ " 명 입니다.");
				
			}
			
		} //run() end
		
	}//ServerReciver end
	
	
	
	public static void main(String[] args) {
		new tcpChatServer().start();
		
	}
}
