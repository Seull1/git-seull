package day14_io_object;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws Exception{
		
		InputStream is = new FileInputStream("C:\\Users\\Playdata\\Documents\\아무거나\\grade.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Grade dto = (Grade)ois.readObject();
		System.out.println("아웃풋 결과: "+ dto);
		ois.close();
		
	}

}
