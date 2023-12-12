package day14_io_FileObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileObjectLoad {
	public static void main(String[] args) {
		
		String name , id ,pwd , temp ,phone;
		int age =0;
		boolean gender = true;
		name = id = pwd = temp = phone =null;
		
		File f = new File("C:\\Users\\Playdata\\Documents\\아무거나\\member.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			name=(String)bis.readObject();
			id=(String)bis.readObject();
			pwd=(String)bis.readObject();
			gender=(Boolean)bis.readObject();
			age=(Integer)bis.readObject();
			phone=(String)bis.readObject();
			
			System.out.println("\t\t\t >> 회원정보 <<\n");
			System.out.println("Name \t\t ID \t\t PWD \t\t Gender \t\t AGE \t\t Phone");
			System.out.println();
			System.out.println(name+ "\t"+id+"\t"+pwd+"\t");
			if(gender == true) System.out.print("남자");
			else System.out.println("여자");
			System.out.println("\t"+ age +"\t"+phone);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			bis.close();   ??에러
		}
		
	}

}
