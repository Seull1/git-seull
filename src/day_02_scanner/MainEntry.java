package day_02_scanner;  // 무조건 사용자 패키지가 위에 와야함
import java.util.Scanner;

// import java.lang.*;   /// 자동으로 임포트됨
// 패키지 임포트 하기


public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세여 : ");
		int su = sc.nextInt()	;
		System.out.print("이름을 입력하세여 : ");
		String name =sc.next();
		
		
		System.out.println("숫자 : "+  su+ ",  이름 : " + name);
	}

}
