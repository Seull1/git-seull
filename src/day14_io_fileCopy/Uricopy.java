package day14_io_fileCopy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Uricopy {
	public static void main(String[] args) 
				throws MalformedURLException , IOException{ //예외처리 위임
		
		//예외발생ㅇ
		URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_light_color_272x92dp.png");
		
		//읽기 객체 - FileInputStream
		InputStream is = url.openStream(); //통로 연결 //예외발생
				
		//쓰기 객체 -FileOutputStream
		OutputStream os = new FileOutputStream("C:\\\\Users\\\\Playdata\\\\Documents\\\\아무거나\\\\google.jpg"); //생성할 파일이름
				
				byte[] buffer = new byte[1024*8];
				
				while(true) {
					int inputData = is.read(buffer);
					if(inputData == -1) break;
					os.write(buffer , 0,inputData); //버퍼 싸이즈많큼 읽고  넣는다
				}
				is.close();  os.close();
				System.out.println("웹에서 파일을 복사했습니다~~");
	}
	
}
