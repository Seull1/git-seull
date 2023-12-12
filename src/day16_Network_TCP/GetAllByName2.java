package day16_Network_TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetAllByName2 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("로컬 호스트 이름 : "+ address.getHostName());
		System.out.println("로컬 호스트 IP주소 : "+ address.getHostAddress());
		System.out.println("------------------------------------");
	
		address=InetAddress.getByName("www.en-core.com");
		System.out.println("로컬 호스트 이름 : "+ address.getHostName());
		System.out.println("로컬 호스트 IP주소 : "+ address.getHostAddress());
		System.out.println("------------------------------------");
		
		byte[] addr = new byte[4];
		addr[0] = (byte)192;
		addr[1] = (byte)168;
		addr[2] = (byte)0;
		addr[3] = (byte)31;
		
		
		address = InetAddress.getByAddress(addr);
		System.out.println("로컬 호스트 이름 : "+ address.getHostName());
		System.out.println("로컬 호스트 주소 : "+ address.getCanonicalHostName());
		System.out.println("로컬 호스트 주소 : "+ address.getHostAddress());
		System.out.println("=======================================");
		
		
		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		
		for (InetAddress item : arr) {
			System.out.println("로컬 호스트 이름 : "+ item.getHostName());
			System.out.println("로컬 호스트 주소 : "+ item.getHostAddress());
			
		}
	}

}
