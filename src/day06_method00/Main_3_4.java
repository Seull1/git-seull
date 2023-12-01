package day06_method00;
/*
public class Main_3_4 {
	//3) 매개변수 없고, 리턴타입 있는 경우
	//public returnType methodName(){  retrun value;  }
	// returnType 은 호출
	// 리턴은 1개의 값만 리턴 가능 ex) return x,y ; <-- 에러
	public static String show() {
		//return "Hello String";
		String str = "Hello world";
		return str;
	}
	
	public static int iShow() {
		int su=99;
		return su;
	}
	
	
	public static void main(String[] args) {
		String x = show();
		System.out.println(x);
		System.out.println(show());
		System.out.println(iShow());
		int num = iShow();
		System.out.println(num);
		
	}
}
*/

public class Main_3_4{
	
//	4)매개변수 있고, 리턴타입 있는 경우
//     public returnType methodName(parmameteer val1, parmameteer val2,….) {return value}
	
	public static int plus(int x ,int y) {
		int hap = x+y;
		return hap; // retutn x+y;
	}
	
	public static void main(String[] args) {
		int add = plus(1,2);
		System.out.println(add);
		
		
	}
}

