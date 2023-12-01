package day01_operator.quiz;

import java.io.InputStream;
import java.util.Scanner;

/*
// 두 수 입력 받아서 큰 수 출력하기
public class Quiz02_if {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요1 : ");
		int su = new Scanner(System.in).nextInt();
		System.out.println("숫자를 입력하세요2 : ");
		int su2 = new Scanner(System.in).nextInt();
		
		if(su>su2) {
			System.out.println("첫번째 숫자가 큽니다");
		}else {
			System.out.println("두번째 숫자가 큽니다");
		}
	}
}
*/

// 년도 입력 받아서 윤/평년 프로그램 작성
// 윤년/평년 판정 프로그램 작성
/*
 힌트 if(년도 % 4 ==0)
 			if( (년도 % 100 !=0) || (년도 % 400 ==0)
 			"윤년"
 */

/*
public class Quiz02_if {
	public static void main(String[] args) {
		
		System.out.println("년도를 입력하세요 : ");
		int year = new Scanner(System.in).nextInt();
		
		if(year % 4 == 0) {
			if((year %100 !=0) || (year % 400 ==0)) {
				System.out.println("입력하신 년도는 '윤년' 입니다. ");
			}else {
				System.out.println("입력하신 년도는 '평년' 입니다. ");
			}
		}else {
			System.out.println("입력하신 년도는 '평년' 입니다. ");
		}

		}
	}
*/

/*
public class Quiz02_if {
	public static void main(String[] args) {
		
		System.out.println("년도를 입력하세요 : ");
		int year = new Scanner(System.in).nextInt();
		String result = null;
		boolean flag = false;
		
		if( year % 4 ==0) {
			if( year % 100 !=0 || year % 400 == 0 ) {
				flag = true ;
			}
		}
		
		result = (flag == true) ? "윤년" : "평년" ;   //삼항
	}
}
*/

// 전산,영어,국어 점수 입력 받아서 평균 60점 이상이면 합격이지만
// 각 과목 과락 40점 이하면 과목 불합격 처리하는 프로그램 작성
/*
public class Quiz02_if{
	public static void main(String[] args) {
		System.out.println("전산 점수를 입렵하세요 : ");
		int x =new Scanner(System.in).nextInt();
		System.out.println("영어 점수를 입렵하세요 : ");
		int y =new Scanner(System.in).nextInt();
		System.out.println("국어 점수를 입렵하세요 : ");
		int z =new Scanner(System.in).nextInt();
		
		int avg=(x+y+z)/3;
		
		
		System.out.println("---------------------------------");
		System.out.println("------------결과는-------------");
		if(avg>=60) {
			if(x>=60) {
				if(y>60) {
					if(z>60) {
						System.out.println("평균점수 : " +avg+ "합격입니다");
					}else {
						System.out.println("국어점수 과락입니다");
						System.out.println("불합격 입니다. ");
					}
				}else {
					System.out.println("영어점수 과락입니다");
					System.out.println("불합격 입니다. ");
				}
			}else {
				System.out.println("전산점수 과락입니다");
				System.out.println("불합격 입니다. ");
			}
			
		}else {
			System.out.println("평균 불합격 입니다. ");
		}
		
	}
}
*/

/*
public class Quiz02_if{
	public static void main(String[] args) {
		System.out.println("국어 = ");     int kor = new Scanner(System.in).nextInt()	;
		System.out.println("영어 = ");     int eng = new Scanner(System.in).nextInt()	;
		System.out.println("전산 = ");     int com = new Scanner(System.in).nextInt()	;
		
		double avg = (kor + eng + com) /3.0;
		
		if(avg >= 60) {
			
			if(kor >=40 && eng >=400 && com>= 40) {
				System.out.printf("모든 과목이 40점 이상이며 , 평균이 %.2f로 [합격] 입니다 \n",avg);
			}else {
				System.out.printf("평균은 %.2f 이지만",avg);
				if( kor < 40) System.out.print("국어" + kor + "점");
				if( eng < 40) System.out.print("영어" + eng + "점");
				if( com < 40) System.out.print("전산" + com + "점");
				System.out.print("으로 [과락탈락]입니다 \n");
			}
		}else {
			System.out.printf("평균이 %.f로 평균탈락입니다",avg);
		}
	}
}
*/

// day3 ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
// ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
//  ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
// 숫자 입력 받아서 짝/홀수 판정 프로그램 (switch 사용해서)
/*
public class Quiz {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");
		int x = new Scanner(System.in).nextInt();

		switch (x % 2) {
		case 0:
			System.out.println("짝수입니다");
			break;
		case 1 : System.out.println("홀수입니다");
		
		default : System.out.println("정수 숫자만 입력하세요");
		}
	}
}
*/

/*
//원하는 단입력 받아서 구구단 출력하기
public class Quiz {
	public static void main(String[] args) {
		System.out.println("1~9 까지 원하는 구구단 단을 입력하세요 : ");
		int x = new Scanner(System.in).nextInt();
		
		
		for(int i=1; i<=9; i++) {
			System.out.println(x + "* " + i + "=" + (i*x));
		}
		for(int i=1; i<=3; i++) {
			System.out.print(i+  "\t" );
		}
		
			
	}
}
*/

//문제] 1~100중에 3의배수의 합과 개수 구하는 프로그램 작성 (for)

/*
public class Quiz {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i; // sum=sum+i
				count++; // count=count+1;  count +=1 ;
			}
		}
		System.out.print(sum + "\t" + count);
	}
}
*/

/*
// 1~100 까지의 값 더하기
public class Quiz{
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			sum=sum+i;
	}
		System.out.println(sum);
}
}
*/

