package day04_control_while;

import java.util.Scanner;

/*
public class while_start {
	public static void main(String[] args) {
		System.out.println("for ----------");
		for (int i = 1; i < 4; i++) {
			System.out.println(i + "\t");
		}
		System.out.println(" \n while-----------");
		int a=1; //변수선언
		while(a<=3) {     // while(a++ <=3){System.out.println(a+"\t");}
			System.out.println(a+"\t");
			a++; //증감식
		}
		System.out.println(a);  //현제 a =4
		a=1;
		do {
			System.out.println(a+"\t");
			a++;
		}while(a <=3);
	}

}
*/

/*
public class while_start{
	public static void main(String[] args) {
		System.out.println("원하는 단을 입력하세요 1~9 : ");
		int x= new Scanner(System.in).nextInt();
		
			int i=0;
			while(i++ <=8) {
				System.out.println(x + " X " + i + " " + " = " +(x*i));
			}
	}
}
*/

/*
public class while_start{
	public static void main(String[] args) {
		int i=1 ;
		while(i<=8) {
			int j=1;
			i++;
			do {
				System.out.print(i + "X" + j +"= " + (i*j) + "\n");
				j ++;
			}while(j <= 9);
			System.out.println();
			
		}
	}
}
*/

/*
public class while_start{
	public static void main(String[] args) {
		int su=0;
		do {
			System.out.println("점수(0~100) = ? ");
			su= new Scanner(System.in).nextInt();
			
			System.out.println(su);
		}while (su<0 || su>100);
	}
}
*/


// 무한루프  점수 계속 넣기 yes or no 로
public class while_start{
	public static void main(String[] args) {
		int su;
		
		while (true) { // 무한루프
			do {
				System.out.println("국어 점수를 입력하세요(0~100) : ");
				su = new Scanner(System.in).nextInt();
				System.out.println(su);
			}while(su >=0 && su >=100);
			
			System.out.println("점수 더 입력 받으시겠습니까?(y/n)");
			char x = new Scanner(System.in).next().charAt(0);
			if(x == 'n' || x== 'N') break;
		}
		
	}
}