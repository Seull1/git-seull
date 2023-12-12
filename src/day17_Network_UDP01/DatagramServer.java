package day17_Network_UDP01;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer {    //UDP
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataOutputStream dos = null;
		
		int port = 8000;
		String str;
		File file = null;
		
		
		try {
			System.out.println("@@@ UDP file server");
			ds= new DatagramSocket(port);
			
			while(true) {
				dp = new DatagramPacket(new byte[65536],65536);
				ds.receive(dp);
				
				str =new String(dp.getData(),dp.getLength()).trim();
				
				if(str.equalsIgnoreCase("start")) {
					System.out.println("전송중 입니다..");
					file = new File("C:\\Users\\Playdata\\Documents\\아무거나\\test.txt");
					
					dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				}else if(str.equalsIgnoreCase("end")) {
					System.out.println("end");
					break;
				}else {
					System.out.println(str);
					dos.write(dp.getData(),0,dp.getLength());
				}
			}//while end
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (Exception e2) {
			}
		}
	}
}
