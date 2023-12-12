package day14_io_FileEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessEx {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Playdata\\Documents\\아무거나\\sawon.txt","rw");
	
	
		for (int i = 0; i <= 10; i++) {
			raf.seek( i* 100);  //위치조정은 seek 가 한다  <= 100만큼 떨어진 위치에 찍겠다  
			String str = " seull ";
			raf.writeUTF(str+ 1);
			
//			raf.writeInt(i);
			
		}
		
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 100); 
			System.out.println(raf.readUTF());
			
			
//			System.out.println(raf.readInt());
			
		}
		
		
		
	System.out.println("String print success!!");
	raf.close();
	
	
	}
	

}
