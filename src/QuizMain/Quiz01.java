package QuizMain;
import java.util.Scanner;
/*
 * 문제1] 월급을 단위로 계산하기
 * pay=567890;
 * result :
 * 만원 : 56장
 * 천원 : 7장
 * 백언 : 8개
 * 십원 : 9개
 */
/*
public class Quiz01 {
	public static void main(String[] args) {
		int pay = 567890 , result = 0;
		
		System.out.println("Pay : "+pay + "원");
		System.out.println("만원 : "+(pay/10000) + "장");
		pay=pay%10000;
		System.out.println("천원 : "+(pay/1000) + "장");
		pay=pay%1000;
		System.out.println("백원 : "+(pay/100)+ "개");
		pay=pay%100;
		System.out.println("십원 : "+(pay/10)+ "개");
		
	}

}
*/

/*
public class Quiz01 {
	public static void main(String[] args) {
		int pay = 567890 ;
		int m,c,b,s;
		c=pay%10000;
		b=pay%1000;
		s=pay%100;
		
		System.out.println("Pay : "+pay + "원");
		System.out.println("만원 : "+(pay/10000) + "장");
		pay=pay%10000;
		System.out.println("천원 : "+(c/1000) + "장");
		pay=pay%1000;
		System.out.println("백원 : "+(b/100)+ "개");
		pay=pay%100;
		System.out.println("십원 : "+(s/10)+ "개");
		
	}

}
*/

// -----------------------------------------------------------------------------------------------------------------------

// 문제2] int su=12345;  주어진 숫자를 시,분,초 로 계산하라
/*
public class Quiz01 {
	public static void main(String[] args) {
		int time=12345;
		int h,t,s ;
		int h1,t1;
		h=time/3600;
		h1=time%3600;
		t=h1/360;
		t1=t%360;
		s=t1%60;
		
		System.out.println(h + "시");
		System.out.println(t + "분");
		System.out.println(s+ "초");
	}

}
*/


/// // 문제 이도연님의 성적표  국어90, 영어 88 전산 100 총점278,평균92.67 

/*
public class Quiz01 {
	public static void main(String[] args) {
		int x =90 ,y = 88, z = 100 ,sum ;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		sum = x+y+z;
		avg= sum/(float)3;
		System.out.print("이름을 입력하세여 : ");
		String name =sc.next();
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		
		System.out.print(name+"님의 성적표----------");
		System.out.print("국어" + x + "  ");
		System.out.print("영어" + y+ "  ");
		System.out.println("전산" + z);
		System.out.println("총점" + sum);
		System.out.println("평균" + avg);
		System.out.printf("평균%.2f",avg);
	}
	
}
*/



















