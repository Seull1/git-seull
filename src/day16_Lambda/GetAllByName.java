package day16_Lambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;


public class GetAllByName {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strurl = null;
		InetAddress[] address;
		
		System.out.println("사이트 주소 : ");
		try {
			strurl = br.readLine(); //예외발생
			address = InetAddress.getAllByName(strurl);
			
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
