package day10_API.utillPackage;

import java.util.StringTokenizer;

public class StaticTokenizer02 {
	public static void main(String[] args) {
		// 두가지로 끊어서 나타내기
	StringTokenizer token =new StringTokenizer("사과=5|초콜렛=7|과자=2","=|",true);
		
		while(token.hasMoreElements()) { //다음 요소가 있느냐>  , //단어 끊어서
//			System.out.println(token.nextToken());
			
			String str = token.nextToken();
			
			if(str.equals("=")) System.out.println("nono");
			else if(str.equals("|")) System.out.println("\n");
			else System.out.println(str);
		}
	}

}
