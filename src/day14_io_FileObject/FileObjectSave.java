package day14_io_FileObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FileObjectSave {
	public static void main(String[] args) throws Exception{
		
		String name , id ,pwd , temp ,phone;
		int age =0;
		boolean gender = true;
		name = id = pwd = temp = phone =null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		File f = new File("C:\\Users\\Playdata\\Documents\\아무거나\\member.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f,true);  //append mode  true를 붙이면 기존 파일에 내용을 추가한다
			oos = new ObjectOutputStream(fos);
			
			System.out.println("---------회원정보 입력하기---------");
			System.out.println("name >> ");    name = br.readLine();
			System.out.println("id >> ");      id = br.readLine();
			System.out.println("pwd >> ");     pwd = br.readLine();
			
			
			System.out.println("gender(m,f) >> ");    temp = br.readLine();
			if(temp.toLowerCase().equals("m"))  gender = true;
			else gender = false;
			
			System.out.println("age >> ");      age = Integer.parseInt( br.readLine());
			System.out.println("phone >> ");    phone = br.readLine();
			
			oos.writeObject(name);
			oos.writeObject(id);
			oos.writeObject(pwd);
			oos.writeObject(gender);
			oos.writeObject(age);
			oos.writeObject(phone);
			
			System.out.println("저장되었습니다.");
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			// oos.close();
		}
	}

}
