package day10_API.utillPackage;

import java.util.StringTokenizer;

public class StaticTokenizer01 {
	public static void main(String[] args) {
		
	//	StringTokenizer st =new StringTokenizer("this is a test");
		StringTokenizer st =new StringTokenizer("이순신/김민성/김연아/ㅁㄴㅇ","/");
		
		while(st.hasMoreElements()) { //다음 요소가 있느냐>  , //단어 끊어서
			System.out.println(st.nextToken());
		}
		
		System.out.println("==============");
		String[] result = "this is a test".split("\\s");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
