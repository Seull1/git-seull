package day14_io_fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy1 {
	public static void main(String[] args)throws Exception {
		//읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("C:\\Users\\Playdata\\Desktop\\자바ppt\\workspace\\하늘.jpg");
		
		//쓰기 객체 -FileOutputStream
		OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Documents\\아무거나\\구름.jpg");
		
		byte[] buffer = new byte[1024*8];
		
		long start = System.currentTimeMillis()	;
		
		while(true) {
			int inputData = is.read(buffer)	;  //buffer 크기많큼 읽어들임
			if(inputData == -1) break;
			os.write(inputData);
			
		}//while end
		long end = System.currentTimeMillis();
		
		System.out.println(end - start ); //복사(작업) 걸린시간
		is.close();
		os.close();
		System.out.println("복사 성공!");
	}

}
