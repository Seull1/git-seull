
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
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
/*
public class ManinEntry {
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
		} //  try end
		System.out.println(result);
	}
}
*/

public class ManinEntry {
	public static void main(String[] args) {
		int x ,y,result=0;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 두개를 입력하세요 : ");
			System.out.println("integer 1 >  ");  int num1=sc.nextInt();
			System.out.println("integer 2 >  ");  int num2=sc.nextInt();
			System.out.println("num1 / num2 = "+ (num1/num2));
			
		}catch (InputMismatchException e) {
			System.out.println("InputMismatchException 입니다");
			System.out.println("올바른 숫자를 입력하세요");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 입니다");
			System.out.println("0으로 나눌수 없습니다");
		}catch(Exception e) {
			System.out.println("ArithmeticException 입니다");
			System.out.println("0으로 나눌수 없습니다");
		}
	}
}