package day13_io_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		//2개 정수 입력 받고 ,1개의 연산자 입력받아서 사칙연산 프로그램 작성하기(io 처리)
	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자 2개 입력 하세요 : ");
		int str =  Integer.parseInt(br.readLine()); // 예외발생
		int str2 =  Integer.parseInt(br.readLine());
		
		System.out.println("사칙연산 하나 입력하세요 : ");
		int str3 =  System.in.read();
//		char str3 = br.readLine().charAt(0);
		
		System.out.println((char)str3);
		
		switch ((char)str3) {
		case '*' :System.out.println(str*str2);
			break;
		case '/' :if(str > str2)System.out.println(str/str2);
		else System.out.println("뒤의 숫자가 더 큽니다");
			break;
		case '+' :System.out.println(str+str2);
			break;
		case '-' :System.out.println(str*str2);
			break;

		default: System.out.println("+ , - , * , / 중 하나만 입력하세요");
		}
	
	}

}
