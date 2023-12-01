package day10_API.Quiz;
 // ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
public class Main {
	public static void main(String[] args) {
		String str = "abcDEFGHijklasd";
		String a ;
		//위의 str 문자열을 대문자는 소문자로 소문자는 대문자로 출력
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if(x >= 'A' && x <= 'Z') ;
			else System.out.println(str.toLowerCase());
			
		}
	}

}
