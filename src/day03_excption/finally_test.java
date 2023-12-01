
package day03_excption;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
public class ManinEntry {
	public static void main(String[] args) {
		int x=30 ,y=0;
		int result =0 ;
		
		if(y==0) {
			System.out.println("0으로 나눌수 없습니다");
			return;
		}else {
			 result = x/y;     //예외 발생
			
		}
		
	
		
		System.out.println(result);
	}

}
*/

/*
///         finally 는 try만 가든 catch 들어가든 무조건 출력됨
public class finally_test {
	public static void main(String[] args) {
		int x ,y,result=0;
		
		System.out.println("x,y = ");
		
		try {
			x=new Scanner(System.in).nextInt();
			y=new Scanner(System.in).nextInt();
			
			result=x/y;   //문제 발생 소지 코드
			
		}catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("finally 무조건 처리됨!!");
		}
	}
}
*/

// 예외 처리 위임
public class finally_test {
	public static void main(String[] args)
			//	throws ArithmeticException,InputMismatchException{  //예외처리 위임
				throws Exception {  //예외처리 위임
		int x ,y,result=0;
		System.out.println("x,y = ");
		
		x= new Scanner(System.in).nextInt();
		y= new Scanner(System.in).nextInt();
		
			
			result=x/y;   //문제 발생 소지 코드
			
		
	}
}
