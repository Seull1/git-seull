package QuizMain;
import java.util.Scanner;


// 3과목 입력 받고,총점,평균,학점(if , switch) 구하기
/*
public class day03 {
	public static void main(String[] args) {

		System.out.println("학생의 이름을 입력하세요 : ");
		String name = new Scanner(System.in).next();
		
		System.out.println("과목 3개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
//		 int kor = sc.nextInt();
//		 int eng = sc.nextInt();
//		 int com = sc.nextInt();
		  
		 
		int sum = (sc.nextInt() + sc.nextInt() + sc.nextInt());
		double avg = sum / 3.0;
		char grade;
		
		
		System.out.printf("%s 님의 총점은 : %d 이며 평균은 : %.2f 이고",name , sum,avg );
		
		if ((int)avg <= 100 && avg >= 90) {
			grade = 'A';
		} else if (avg < 90 && avg >= 80) {
			grade = 'B';
		} else if (avg < 80 && avg >= 70) {
			grade = 'C';
		} else if (avg < 70 && avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("학점은 %s 입니다",grade);
	}
}
*/

/*
public class day03 {
	public static void main(String[] args) {
		System.out.println("원하는 달의 일수 확인 하기 : ");
		int month = new Scanner(System.in).nextInt();  // 5월
		int day = 0;
		String result = null;
		boolean flag = false;
		
		
		
//		 * // JDK 14 이후 새로 추가된 switch 형식 int day = switch( month ) { case 1, 3, 5, 7, 8,
//		 * 10, 12 -> { System.out.println("31일까지 있음!"); yield 31; } case 4,6,9,11 -> {
//		 * System.out.println("30일까지 있음!"); yield 30; } case 2 -> {
//		 * System.out.println("28일까지 있음!"); yield 28; } default -> {
//		 * System.out.println("없는 달입니다. 1~12월까지만,...!"); yield 0; } };
		
		switch (month) {
			case 1 : case 3: case 5: case 7: case 8: case 10: case 12:  day = 31;	break;
			case 4 :
			case 6:
			case 9:
			case 11:   day = 30;	break;
			
			case 2 :
				System.out.print("year = ");
				int year = new Scanner(System.in).nextInt();
				if( (year % 4 == 0) && ( year % 100 != 0 || year % 400 == 0 )) {
					day = 29;  break;
				}
				day = 28;  break;
		}
		System.out.println(month + " ==> " + day + "일까지 있습니다.");
	}
}
*/


public class day03 {
	public static void main(String[] args) {

		System.out.println("학생의 이름을 입력하세요 : ");
		String name = new Scanner(System.in).next();
		int kor=0 , eng=0 , com = 0;
	do {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목 3개를 입력하세요 : ");
		  kor = sc.nextInt();
		  eng = sc.nextInt();
		  com = sc.nextInt();
	}while(kor >=100 || kor <=0 || eng >= 100 ||  eng <=0 || com >= 100 || com <=0 );  
		 
		int sum = kor + eng + com;
		double avg = sum / 3.0;
		char grade;
		
		
		System.out.printf("%s 님의 총점은 : %d 이며 평균은 : %.2f 이고",name , sum,avg );
		
		if ((int)avg <= 100 && avg >= 90) {
			grade = 'A';
		} else if (avg < 90 && avg >= 80) {
			grade = 'B';
		} else if (avg < 80 && avg >= 70) {
			grade = 'C';
		} else if (avg < 70 && avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("학점은 %s 입니다",grade);
	}
}