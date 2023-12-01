package QuizMain;

import java.util.Scanner;
/*
public class Score_method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자함수자동호출
		int kor, eng, com, tot = 0;
		double avg= 0;
		
		System.out.print("name = ");
		String name = sc.nextLine();
		
		// 점수 : 0~100 점까지만 입력 받게 처리 
//		  do {
//				System.out.print("kor, eng, com (0~100점까지) score = ");
//				kor = sc.nextInt();		eng = sc.nextInt();			com = sc.nextInt();
//		  } while ( (kor < 0 || kor > 100) || eng < 0 || eng > 100 || com < 0 || com > 100 );
		
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
		// 학점(평점) 구하기
		
//		String grade = null;
		char grade = ' ';
		switch ( (int) avg / 10 ) {	//switch ( total / 30 ) {
			case 10:
			case 9: grade = 'A';	break;
			case 8: grade = 'B';	break;
			case 7: grade = 'C';	break;
			case 6: grade = 'D';	break;
			default: grade= 'F';		
		} // end switch
		
		
//		    if (avg <= 100 && avg >= 90) {
//				grade = 'A';
//			} else if (avg <= 89 && avg >= 80) {
//				grade = 'B';
//			} else if (avg <= 79 && avg >= 70) {
//				grade = 'C';
//			} else if (avg <= 69 && avg >= 60) {
//				grade = 'D';
//			} else {
//				grade = 'F';
//			}
		 
		
		System.out.println("\n\n****  " +name +"님의 성적표 **********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", tot, avg, grade );
//		System.out.println("학점 : " + grade);
	}

}
*/


//문제5] 성적처리 프로그램 함수로 분할(분리)할것
//입력 함수 input()  - 이름 , 국어, 영어,전산 점수
//총점 함수 total(~~~) - 총점 구하는 함수
//평균 함수 average( ~~ ) - 평균 구하는 함수
//평점(학점) grade( ~~ ) - 학점 구하는 함수
//출력 함수 output( ) - 결과 출력하는 함수

/*
public class Score_method {
	
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, tot = 0;
		double avg= 0;
		System.out.print("name = ");
		String name = sc.nextLine();
		
		
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
	}
	
	public static void total(int kor , int eng ,int com) {
		int  tot = kor + eng + com;
		System.out.print("총합 : "+tot);
	}
	
	public static void average(int kor , int eng ,int  com) {
		double avg = (kor + eng + com) / 3.0 ;
		System.out.print("   평균 : "+avg);
	}
	
	public static void grade1(int kor ,int eng , int com) {
		
		double avg = (kor + eng + com) / 3.0 ;
		char grade = ' ';
		switch ( (int) avg / 10 ) {	//switch ( total / 30 ) {
			case 10:
			case 9: grade = 'A';	break;
			case 8: grade = 'B';	break;
			case 7: grade = 'C';	break;
			case 6: grade = 'D';	break;
			default: grade= 'F';		
		} // end switch
		System.out.print("   학점 : "+ grade);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, tot ;
		double avg= 0;
		System.out.print("name = ");
		String name = sc.nextLine();
		
		
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
		 
		 
		 
		 
	
		 
		 
		 
		System.out.println();
		total( kor, eng ,com);
		average(kor , eng ,com);
		grade1(kor , eng , com);
		
		
		
	}

}
*/

/* ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
public class Score_method {
	
	
	public static int input(Scanner sc){
        int tot = 0;

        System.out.print("점수 입력 : ");
        tot= sc.nextInt();

        return tot;
    }
	
	public static void total(int kor , int eng ,int com) {
		int  tot = kor + eng + com;
		System.out.print("총합 : "+tot);
	}
	
	public static void average(int kor , int eng ,int  com) {
		double avg = (kor + eng + com) / 3.0 ;
		System.out.print("   평균 : "+avg);
	}
	
	public static void grade1(int kor ,int eng , int com) {
		
		double avg = (kor + eng + com) / 3.0 ;
		char grade = ' ';
		switch ( (int) avg / 10 ) {	//switch ( total / 30 ) {
			case 10:
			case 9: grade = 'A';	break;
			case 8: grade = 'B';	break;
			case 7: grade = 'C';	break;
			case 6: grade = 'D';	break;
			default: grade= 'F';		
		} // end switch
		System.out.print("   학점 : "+ grade);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, tot ;
		double avg= 0;
		System.out.print("name = ");
		String name = sc.nextLine();
		
		System.out.println("asd");
		kor = input(sc);
		eng = input(sc);
		com = input(sc);
	
		 
		 
		 
		 
	
		 
		 
		input(sc);
		System.out.println();
		total( kor, eng ,com);
		average(kor , eng ,com);
		grade1(kor , eng , com);
		
		
		
	}

}
*/

/*
public class Score_method {
	
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, tot = 0;
		double avg= 0;
		System.out.print("name = ");
		String name = sc.nextLine();
		
		
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
		 
		 total(kor , eng , com);
		 average(kor , eng , com);
		 grade1(kor , eng ,com);
	}
	
	public static void total(int kor , int eng ,int com) {
		int  tot = kor + eng + com;
		System.out.print("총합 : "+tot);
	}
	
	public static void average(int kor , int eng ,int  com) {
		double avg = (kor + eng + com) / 3.0 ;
		System.out.print("   평균 : "+avg);
	}
	
	public static void grade1(int kor ,int eng , int com) {
		
		double avg = (kor + eng + com) / 3.0 ;
		char grade = ' ';
		switch ( (int) avg / 10 ) {	//switch ( total / 30 ) {
			case 10:
			case 9: grade = 'A';	break;
			case 8: grade = 'B';	break;
			case 7: grade = 'C';	break;
			case 6: grade = 'D';	break;
			default: grade= 'F';		
		} // end switch
		System.out.print("   학점 : "+ grade);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, tot ;
		double avg= 0;
		System.out.print("name = ");
		String name = sc.nextLine();
		
		
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
		 
		 
		 
		 
	
		 
		 input();
		 
		System.out.println();
		total( kor, eng ,com);
		average(kor , eng ,com);
		grade1(kor , eng , com);
		
		
		
	}

}
*/

public class Score_method {
	
	public static void input(int cnt, String[] name_arr, int[][] score, String name, int... x) {
		name_arr[cnt] = name;
		for(int i = 0; i < score[0].length; i++) {
			score[cnt][i] = x[i];
		}
	}
	
	public static int total(int[] score) {
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return total;
	}
	public static double average(int[] score) {
		return (double)total(score)/score.length;
	}
	public static char grade(int[] score) {
		double avg = average(score);
		if(avg >= 90) return 'A';
		else if (avg >= 80) return 'B';
		else if (avg >= 70) return 'C';
		else if (avg >= 60) return 'D';
		else return 'F';		
	}
	public static void output(String[] name_arr, int[][] score) {
		for(int i = 0; i < name_arr.length; i++) {
			System.out.println(name_arr[i] + "님의 성적표");
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n총점 : %d, 평균 : %.2f, 학점 : %c\n", 
					score[i][0], score[i][1], score[i][2], total(score[i]), average(score[i]), grade(score[i]));
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INWON = 3;
		String[] subject_name = {"국어", "영어", "전산"};
		int SUBJECT_NUM = subject_name.length;
		String[] name_arr = new String[INWON];
		int[][] score = new int[INWON][SUBJECT_NUM];
		String name;
		for(int i = 0; i < INWON; i++) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			int[] score_tmp = new int[SUBJECT_NUM];
			for(int j = 0; j < SUBJECT_NUM; j++) {
				System.out.printf("%s 점수 : ", subject_name[j]);
				score_tmp[j] = sc.nextInt();
			}
			input(i, name_arr, score, name, score_tmp[0], score_tmp[1], score_tmp[2]);			
		}
		output(name_arr, score);
	}
}
