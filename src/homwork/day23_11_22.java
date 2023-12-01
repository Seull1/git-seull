package homwork;
import java.util.Scanner;
//과제2] 1번
/*
public class day23_11_22 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				 System.out.print("*");
				 if(i == j)break;
				 
			}// j end
			System.out.println();
		}// i end
	}

}
*/

//과제2] 2번
/*  
public class day23_11_22 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				 System.out.print("*");
				 if(i == j)break;
				 
			}// j end
			System.out.println();
		}// i end
	}

}
*/

//  과제]2 사칙연산 츠로그램 작성(예외처리하기)
//  입력= 숫자2개랑 연산자 1개
// 
//  결과:
//  3
//  5
//  +
/*
public class day23_11_22{
	public static void main(String[] args) {
		System.out.println("숫자 두개와 사칙연산(+,-,*,/)을 입력하세요 : ");
		Scanner x=new Scanner(System.in);
		int num1 = x.nextInt();
		int num2 = x.nextInt();
		char four = new Scanner(System.in).next().charAt(0);
		
		switch (four) {
		case '+' : System.out.println("결과는 : " + (num1 + num2) + "입니다."); break;
		case '-' : System.out.println("결과는 : " + (num1 - num2) + "입니다."); break;
		case '*' : System.out.println("결과는 : " + (num1 * num2) + "입니다."); break;
		case '/' : System.out.println("결과는 : " + (num1 / num2) + "입니다."); break;
		
		default : System.out.println("바르게 입력 하세요!");
		}
	}
}
*/

/*
// 과제3] 예외 처리 적용
public class day23_11_22{
	public static void main(String[] args) {
		System.out.println("숫자 두개와 사칙연산(+,-,*,/)을 입력하세요 : ");
		try {
		Scanner x=new Scanner(System.in);
		int num1 = x.nextInt();
		int num2 = x.nextInt();
		char four = new Scanner(System.in).next().charAt(0);
		
	
		System.out.printf("입력한 첫번째숫자 : %d \n",num1);
		System.out.printf("입력한 두번째숫자 : %d \n",num2);
		System.out.printf("입력한 사칙연산 : %s \n",four);
		
		switch (four) {
		case '+' : System.out.println("결과는 : " + (num1 + num2) + "입니다."); break;
		case '-' : System.out.println("결과는 : " + (num1 - num2) + "입니다."); break;
		case '*' : System.out.println("결과는 : " + (num1 * num2) + "입니다."); break;
		case '/' : System.out.println("결과는 : " + (num1 / num2) + "입니다."); break;
		
		default : System.out.println("바르게 입력 하세요!");
		}
		}catch(Exception e) {
			System.out.println("나눗셈을 할떈 0이 불가능 합니다");
		}
	
	}
}

*/

/*
public class day23_11_22 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5-i; j++)  System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				 System.out.print("*");
				
				 
			}// j end
			
			System.out.println();
		}// i end
	}

}
*/

/*
public class day23_11_22 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for(int j = 0; j < 5-i; j++)  System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				 System.out.print("*");
				
				 
			}// j end
			
			System.out.println();
		}// i end
	}

}
*/
public class day23_11_22 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(j%2 ==0)System.out.print("*");
				System.out.print(" ");
				 
			}// j end
			
			System.out.println();
		}// i end
	}

}