/*
xpackage ex02.basic;

public class MainEntry{
	public static void main(String[] args) {
		System.out.print("Hello java");
		System.out.println(100);
		System.out.print("sasdasd");
	}
		
	}
/*/


package day01_DataType;

public class MainEntry{
	public static void main(String[] args) {
		int su=9;
		char ch = 'A'; //  '문 자'
		String str = "korea";  // "문자열"
		double d = 12.34;
		float f = 12.34f ;
		
		
		System.out.println(su + "," + ch + "," + str);
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);
		System.out.println(f);
		System.out.println(100L);
		System.out.println(12.123F);
		
		System.out.println();
		int su2 = 0 ; // 지역변수는 반드시 초기화 해야함
		System.out.println(su2);
		
		//* -----------------------------------------------------
		int x =2; //기본 자료형
		Integer y=2;  // 참조형 자료형
		System.out.println(x+ "," + y);
		System.out.println(x );
		System.out.println(y);
		
		
//		String str2 ='A';    //에러
//     char ch2="encore"; //에러
//		String str3 ="A";  //실제로는 A/0 이 들어간것 String  타입은 뒤에 /0(null) 이 들어감
	}
		
	}