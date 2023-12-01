package day10_API.string;

class Point{
	
}

public class Main {
	public static void main(String[] args) {
		String str  ="abc";
		System.out.println("str : "+ str);
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));
		
		
		
		char data[] = {'a','b','c'};
		str = new String(data);
		System.out.println("str : "+ str);
		System.out.println("kbs");
		
		String msg = "asdasdads";
		System.out.println("en-core"+ msg);
		System.out.println(msg);
		
		String str2 = "abcdef".substring(2);  //중간값 출력: 2번부터 출력
		System.out.println(str2);
		
		str2 = "abcdefghijklmn".substring(2,5); //시작값 포함 ,끝값 미포함
		System.out.println(str2);
		
		System.out.println(msg +" : " +str2);
		
		// String class 는 특이함 
		String s1 = new String("encore");  //String class 는 문자가 같으면 같은주소 가짐
		String s2 = new String("encore");
		System.out.println("s1.hashcode() : " + s1.hashCode());
		System.out.println("s1.hashcode() : " + s2.hashCode());
		
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println("p1.hashcode() : "+p1.hashCode());
		System.out.println("p2.hashcode() : "+p2.hashCode());
		
		String s3 = "seoul";
		String s4 = "seoul";
		
		if(s3 == s4)System.out.println("same");
		else System.out.println("not same");
		System.out.println("-----------------");
		if(s1 == s2)System.out.println("same");
		else System.out.println("not same");
	}

}
