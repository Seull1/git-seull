package day14_io_fileCopy;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//public class BinartCopy {
//	public static void main(String[] args) {
//		File src = new File("C:/구름.jpg"); //절대경로   //복사할 파일
//		File dist = new File("C:\\Users\\Playdata\\Desktop\\아무거나");  //복사할 파일 위치
//		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
////		BufferedInputStream bis = null;
//		BufferedOutputStream bos = null;
//		
//		
//		try {
//			fis = new FileInputStream(src);
//			fos = new FileOutputStream(dist);
//			bis = new BufferedInputStream(fis);
//			bos = new BufferedOutputStream(fos);
			
//			while((c = bis.read()) ! = =-1) {
//				bos.write((char)c);
				
//			}
//			
//			System.out.println("파일복사 성공");
//			bis.close();
//			bos.close();
//			fis.close();
//			fos.close();
//			
//			
//		} catch (Exception e) {
//			System.out.println("파일복사 오류 발생");
//		}
//	}
//
//}
