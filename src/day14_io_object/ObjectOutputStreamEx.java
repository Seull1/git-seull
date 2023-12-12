package day14_io_object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws Exception {
		
		Grade vo = new Grade();
		vo.setSubject("미술");
		vo.setScore(80);
		
		System.out.println(vo);  //화면출력
		OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Documents\\아무거나\\grade.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo); // 파일 grade.dat 안에 쓴다
		oos.close();
		
	}

}
