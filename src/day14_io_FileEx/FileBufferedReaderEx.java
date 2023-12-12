package day14_io_FileEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileBufferedReaderEx {
	public static void main(String[] args) throws IOException {
		
		int i=0;
		String file;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("읽어 올 파일 이름 입력 요망(절대 경로는 앞에 경로도 입력) : ");
		file = br.readLine();
		
		System.out.println(file + "문서의 내용은 .....");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		while((i= reader.read()) != -1) {
			System.out.println((char)i + " ");
			if( fr.equals("\n")) System.out.println();
		}
		fr.close();
	}

}
