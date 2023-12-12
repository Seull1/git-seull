package day12.Quiz.video;

import java.util.Scanner;

public class Main {
	static String title;
	static String category;
	static char lend;
	static String name;
	static String date;
	
	public static void menu() {
		System.out.println("\n\n----- 메뉴 ------");
		System.out.println("1. 비디오 정보 입력");
		System.out.println("2. 비디오 정보 삭제");
		System.out.println("3. 비디어 정보 수정");
		System.out.println("4. 비디오 보기");
		System.out.println("5. 종료");
		System.out.println("---------------------");
		System.out.print(" >> ");
	}
	
	public static void main(String[] args) {
		
		Video c = new Video();
		
Scanner sc = new Scanner(System.in);
		
		try {
			while (true) {  //무한루프 --> 탈출구문
				menu();
				int inNum = sc.nextInt();

				try {
					switch (inNum) {
					case 1:
						System.out.println("\n*-*-*-* 1. 고객 정보 입력 *-*-*-*");
						c.VideoAdd();
						System.out.println("* 입력완료");
						break;
					case 2:
						System.out.println("\n*-*-*-* 2. 고객 정보 삭제 *-*-*-*");
						c.display();
						System.out.println("---------------------------");
						System.out.print("삭제할 고객의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						c.CustomerRmv(inNum);
						break;
					case 3:
						System.out.println("\n*-*-*-* 3. 고객 정보 수정 *-*-*-*");
						c.display();
						System.out.println("---------------------------");
						System.out.print("수정할 고객의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						System.out.println("수정할 고객의 정보를 입력하세요.");
						inCustomer();
						c.CustomerCh(inNum, title, category,lend);
						break;
					case 4:
						System.out.println("\n*-*-*-* 4. 모든 고객 보기 *-*-*-*");
						c.display();
						break;
					case 5:
						System.out.println("\n* 프로그램을 종료합니다.");
						System.exit(0);
						break;
					default:
						System.out.println("\nerr)잘못입력하셨습니다. 다시 입력해주세요.");
					} // switch
				} catch (Exception e) {
					System.out.println("err) 없는 고객입니다. 다시 입력해주세요.");
				} // try catch
			} // while
		} catch (Exception e) {
			System.out.println("err) 잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}// try catch

	}// main
		
	public static void inCustomer() {
		Scanner sc = new Scanner(System.in);

		System.out.print("비디오 이름 >> ");
		title = sc.next();
		System.out.print("장르 >> ");
		category = sc.next();
		System.out.print("대여 여부  >> ");
		lend = sc.next().charAt(0);
	}
	

}
