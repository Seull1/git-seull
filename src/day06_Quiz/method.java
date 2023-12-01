package day06_Quiz;
import java.util.Scanner;
/*
public class method {
	// 문제1] info() {이름,연락,주소 출력함수}
	public static void info() {
		System.out.println("김민 , 010 9789 , 충남");
	}

	// 문제2] abs(int x) {절대값 구하는 함수}
	public static void abs(int x) {
		if(x < 0) x = -x;
		else x= x;
		System.out.println("절대값 : "+ x);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		info();
		info();
		max();
		abs(-7);
		System.out.println("정수 데이터 입력 : ");
		int su = sc.nextInt();
		abs(su);
		
	}
	
	//문제3] max(){ 정수2개 입력 받아서 큰수 출력 함수}
	public static void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int n2 = sc.nextInt();
		
		int x = (n1 > n2 )	? n1 : n2;
		System.out.println("큰 수 : "+x);
		
	}
}
*/


//문제]사칙연산 (+,-,*,/) 함수 - 2개 리턴타입 매개변수 있는, 2개는 리턴타입 아닌 상태
//plus(+) , sub(-), mul(*), div(/) <--예외처리
public class method{
	
	public static int plus(int x , int y) {
		int hap = x+y;
		return hap;
	}
	
	public static int sub(int x ,int y) {
		int sub = x - y;
		System.out.println(sub);
		return sub;
	}
	
	public static void div(int x , int y) {
		if(y==0) {
			System.out.println("0으로 나눌수는 없습니다");
			
		}
		System.out.println(x/y);
	}
	
	public static int mul(int x , int y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		while(true) {
			System.out.println("integer data input(1,2,3,4,0) = ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: System.out.println("덧셈 함수 호출 : x ,y = ");
				result = plus(sc.nextInt(), sc.nextInt());
				System.out.println(result);
				break;
			case 2:
				System.out.println("뺼셈 함수 호출 : x ,y = ");
				sub(sc.nextInt(), sc.nextInt());
				break;
			case 3:
				System.out.println("나눗셈 함수 호출 : x ,y = ");
				div(sc.nextInt(), sc.nextInt());
				break;
			case 4:
				System.out.println("곱셈 함수 호출 : x ,y = ");
				result = mul(sc.nextInt(), sc.nextInt());
				System.out.println(result);
				break;
			case 0:
				System.out.println("프로그램 종료합니다");
				System.exit(0);  // 강제종료
			default : System.out.println("없는 번호이거나 문자를 넣거나 (1,2,3,4)중에서 선택해 주세요");
			System.exit(0);
			}
			
			System.out.println("프로그램을 종료합니다");
		}//while end
		
		
	}// main end
}