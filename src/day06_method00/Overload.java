package day06_method00;


// overload(중복함수)
/*
public class Overload {
	
	public static int plus(int x , int y, int z) {
		int hap = x+y+z;
		return hap;
	}
	
	public static double plus(int x , int y , double z , int a) { // 함수원형 타입 - double
		return x + y + z + a;   // return int
	}
	
	public static void add(String str1 , String str2) {
		System.out.println(str1 + str2);
	}
	public static void add(int str1 , double str2) {
		System.out.println(str1 + str2);
	}
	public static void add(int str1 , String str2) {
		System.out.println(str1 + str2);
	}	
	public static String name(int str1 , String str2) {
		return str1 + str2;
	}
	
	
	public static void main(String[] args) {
		
	}
}
*/

public class Overload{
	
	public static void line(String str) {
		for (int i = 0; i < 10; i++) {
			System.out.print(str);
		}
	}
	public static void line(String str , int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(str);
		}
	}
	
	public static void main(String[] args) {
		line("A");
		System.out.println();
		line("&" , 99);
		
	}
	
	
		
	
}
