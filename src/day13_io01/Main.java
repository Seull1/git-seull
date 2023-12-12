package day13_io01;

import java.io.InputStream;

public class Main {
	public static void main(String[] args) {
		InputStream is = System.in;  //표준입력
		
		try {
			System.out.println("단일 문자 입력 : " );
	//		int num = is.read();   //예외 발생 //rea 메소드는 한글자 만 읽을수 있다
			// '0' ~ '9' : 48 ~ 57 (AScII code)
			
			int num = is.read() - 48; //5
			
			is.read();  is.read(); //문제 발생 처리 - 자바 에서는 '문자' 2바이트 처리됨
			
			int num2 = is.read() - 48; //3
			
			System.out.println(num);
			System.out.println((char)num);
			System.out.println(num+num2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
