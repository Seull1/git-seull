package day01_DataType;

/*
public class DataType {
	public static void main(String[] args) {
		short sh= -32768;  // -32,768 ~ 32,767
		int su = 32770;   //  <-- 32767 에서 3칸을 더 돌아서 -32766 을 출력한다
		
//		su = sh;  //묵시적(자동) 형변환 
		sh = (short)su;  //명시적 형변환 - 데이터 손실 발생
		
		System.out.println(sh + ",   " + su);
		
	}
}
*/

/*
public class DataType{
	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch + ", ASCII code =" + (int)ch);
		
		int num  = 9;  //10진수
		int xNum = 0x9; // 0x숫자 : 16진수
		int oNum = 011; //0숫자 : 8진수
		int bNum = 0B1001 ; // 0b숫자 : 2진수
		
		System.out.println("10진수 : " + num);
		System.out.println("16진수 : " + xNum);
		System.out.println("8진수 : " + oNum);
		System.out.println("2진수 : " + bNum);
		System.out.println("===============");
		System.out.printf("%d %d \n", 0xa , 0xA );    // 16 진수를 10진수로 표현
		System.out.println("===============");
		System.out.printf("%x %X \n" , 10, 10	);  //16 진수를 10진수로 표현
		System.out.printf("%o %o \n" , 10, 10	);  //8진수를 10 진수로 표현
		}
}
*/

/*
public class DataType{
	public static void main(String[] args) {
		String str = "A";
		char ch = 'A'; 
		char ch2 = 67;
		char ch3 = 'b';
		
		int su = 20; 
		String name ="seull"; 
		double dd = 12.34;
		
		System.out.println("ch = " +ch);
		System.out.println("(int)ch = " +(int)ch);  //A의 주소출력
		System.out.println(ch2 + ", " + (char)ch2);
		System.out.println("name = " +name);
		System.out.println("실수형 데이터 : " + dd);
		System.out.printf("%f %f\n", dd, 33.5678);
		System.out.printf("%10.1f %.2f\n", dd, 33.5678); //   소숫점 1자리까지 출력    12.3    33.57  
		System.out.println(dd);
	}
}
*/

/*
public class DataType{
	public static void main(String[] args) {
		
		System.out.println(" \n \n boolean  type");
		boolean flag = true;
//		int b= flag;    ///에러 나옴 (컴퓨터는 true면 1을 반환해서 변수에 들어 갈거라 생각하는데 java에서는 에러뜸)
		System.out.println(flag);
	}
}
*/

public class DataType{
	public static void main(String[] args) {
		int x =5;
		int y = 10;
		String str = "test test";
		char z ='A';
		float f = 1200.123123F;
		int score1 = 232;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
		System.out.println("z = " +z);
		System.out.println("A 의 ASCII 주소 = " +(int)z);
		System.out.printf("%.3f" , f);
		
		
	}
	
}


