package day14_io_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInput1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
//			OutputStream os = new FileOutputStream("hello.txt"); //상대경로,예외발생
			OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Desktop\\아무거나\\aaa.txt"); //절대경로,예외발생
			
			while(true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine()+"\r\n"; // /r은 home 키누른거랑 똑같다 (커서 앞으로)
				
				if(str.equalsIgnoreCase("EXIT/r/n")){
					System.out.println(str.length() + "byte 만큼 썻습니다. ");
					break;
				}
				
				os.write(str.getBytes()); // 예외발생 , 읽어들인 문자 str의 길이(getBtres())만큼 써주세요
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 못찾음...");
		}catch (IOException e) {
			System.out.println("에러에러");
			
		}

	}

}
