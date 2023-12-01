package QuizMain;

import java.util.Scanner;


public class day04 {
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


/*
//  성적표 출력하고 여러번 다시 입력해서 출력하기ㅗ
public class day04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자함수자동호출
		
		while(true) { //무한루프 시작
			
		int kor, eng, com, tot = 0;
		double avg= 0;
		String name = "김연아";
		
		System.out.print("name = ");
		name = sc.next();
		
		 do {
				System.out.print("국어 점수를 입력하세요(0~100) = ");
				kor = sc.nextInt();	
		  } while ( kor < 0 || kor > 100 );
		 do {
				System.out.print("영어 점수를 입력하세요(0~100) = ");
				eng = sc.nextInt();	
		  } while ( eng < 0 || eng > 100 );
		 do {
				System.out.print("전산 점수를 입력하세요(0~100) = ");
				com = sc.nextInt();	
		  } while ( com < 0 || com > 100 );
			
		tot = kor + eng + com;
		avg = tot / 3.0 ;  // avg = (double)tot / 3; 
		char grade = ' ';
		switch ( (int) avg / 10 ) {	//switch ( total / 30 ) {
			case 10:
			case 9: grade = 'A';	break;
			case 8: grade = 'B';	break;
			case 7: grade = 'C';	break;
			case 6: grade = 'D';	break;
			default: grade= 'F';		
		} // end switch
		
		System.out.println("\n\n****  " +name +"님의 성적표 **********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c \n", tot, avg, grade );
		System.out.println();
		System.out.println();
		
		System.out.println("다른 학생을 더 입력 하시겠습니까? (y/n) : ");
		char x = new Scanner(System.in).next().charAt(0);
		// if(x == 'n' || x== 'N') break;
		// if(x.equals("n") || x.equals("N") breack;
		if(x.equalsIgnorCase("n")) break; 
		} // while end
	}
}
*/