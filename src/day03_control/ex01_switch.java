package day03_control;

import java.util.Scanner;

/*
public class ex01_switch {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는?? (1~3) input : ");
		
		int point = new Scanner(System.in).nextInt();
		
		switch (point){
			case 1:  //숫자 , '문자', "문자열"
					System.out.println("포인트 점수 1 입니다");
					break;
			case 2:
			case 3:
			default : System.out.println("없는 점수 입니다. 1~3 까지만 입력하세여");  //case 에 맞지 않는 것을 입력했을때 나오는 것
		} // switch end
	}

}
*/

/*
public class ex01_switch {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s,b,d,j) = ");
		
		char ch = new Scanner(System.in).next().charAt(0);  /// charAt(0) <==뜻은 입력받은수의 자릿수 0이라 첫번쨰 자리
		
		switch (ch) {   //조건 - 문자형,정수형(long형 제외),실수형 안됨
		case 's' : System.out.print("서울 "); break;
		case 'b' : System.out.print("대구 "); break;
		case 'd' : System.out.print("부산 "); break;
		case 'j' : System.out.print("제주 "); break;
		default : 
			System.out.println("s(서울),b(대구),d(부산),j(제주) 중 하나만입력하세요");
			System.exit(0);   //프로그램 강제 종료
		}
		
		System.out.println("를(을) 선택하셨습니다 . ");
	}

}
*/

/*
public class ex01_switch {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s,b,d,j) = ");
		
		String ch = new Scanner(System.in).next();
		
		switch (ch) {   //조건 - 문자형,정수형(long형 제외),실수형 안됨
		case "s" : System.out.print("서울 "); break;
		case "b" : System.out.print("대구 "); break;
		case "d" : System.out.print("부산 "); break;
		case "j" : System.out.print("제주 "); break;
		default : 
			System.out.println("s(서울),b(대구),d(부산),j(제주) 중 하나만입력하세요");
			System.exit(0);   //프로그램 강제 종료
		}
		
		System.out.println("를(을) 선택하셨습니다 . ");
	}
}
*/

/*
// switch break 차이점
public class ex01_switch {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s,b,d,j) = ");
		
		String ch = new Scanner(System.in).next();
		
		switch (ch) {  
		case "s" : System.out.print("서울 "); //break;
		case "b" : System.out.print("대구 "); //break;
		case "d" : System.out.print("부산 "); //break;
		case "j" : System.out.print("제주 "); //break;
		
		}
		
		System.out.println("를(을) 선택하셨습니다 . ");
	}
}
*/

/*
public class ex01_switch {
	public static void main(String[] args) {
		System.out.println("point =  ");
		
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {  
		case 1 : System.out.print("집 "); //break;
		case 2 : System.out.print("피아노 "); //break;
		case 3 : System.out.print("우산 "); //break;

		
		}
		
		System.out.println("상품에 당첨 되셨습니다.");
	}
}
*/

/*
// switch 로 학점 나누기
public class ex01_switch{
	public static void main(String[] args) {
		System.out.println("input jumsu(k,e,c) = ");
		Scanner sc = new Scanner(System.in);
		int total = (sc.nextInt()+sc.nextInt() + sc.nextInt());
		double avg = (double)total/3;
		char grade;
		
		switch ( (int)avg /10 ) {				// switch(total / 30) {
		case 10:
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
			
		default : grade = 'F';
		}
		System.out.println("\n\n" + total + " ===> " + grade + "학점");
	}
}
*/


public class ex01_switch{
	public static void main(String[] args) {
		System.out.println("input jumsu(k,e,c) = ");
		Scanner sc = new Scanner(System.in);
		int total = (sc.nextInt()+sc.nextInt() + sc.nextInt());
		double avg = (double)total/3;

		System.out.print("당신의 학점은 : ");
		if(avg == 100) {
			System.out.println("SSS");
		}else {
			if (avg >=90) {
				System.out.println("A");
			}else {
				if(avg>=80) {
					System.out.println("B");
				}else {
					if(avg>=70) {
						System.out.println("C");
					}else {
						System.out.println("F");
					}
				}
			}
		}
	}
}