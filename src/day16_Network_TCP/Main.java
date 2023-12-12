package day16_Network_TCP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
	public static void main(String[] args) {
		String host = "192.168.0.31";
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for(InetAddress item : address) {
				System.out.println(item);
				System.out.println(item.getCanonicalHostName());
				
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
