package day06_method00;

import java.util.Scanner;

/*
public class Main {
//	1) 매개변수 없고, 리턴타입 없는 경우
//	public return Type  methodName() {}
	public static void line(){
		System.out.println("---------------");
	}

//	2) 매개변수 있고, 리턴타임 없는경우
//	public retrunType methodName(parmameteer val1, parmameteer val2,….){}
	public static void showName(String name,int age) {
		System.out.println("당신의 이름은 "+name+"이시군요.");
		System.out.println("당신의 나이는 "+age+"살!.");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main start");
		line(); // 함수 호출
		line();
		showName("김준규",13 );
		line();
		display();
		line();
		System.out.println("main end");
	}
	
	public static void display() {  //함수정의부
		System.out.println("happy happy happy");
	}
}
*/

//매개변수 있고, 리턴타입 없는 경우
public class Main_1_2 {
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