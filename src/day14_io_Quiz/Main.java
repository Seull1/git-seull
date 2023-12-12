package day14_io_Quiz;

import java.io.IOException;
import java.util.Scanner;

//문제] 비만도 측정 프로그램 작성 - collection, file, io 이용하기
//추가 / 삭제 / 출력 / 수정  처리할것 (file 저장 함수 따로 만들수도 있고)
//몸무게, 키를 입력 받아서  BMI 계산하기
//BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) );
//남 : (신장cm - 100) X 0.9
//여 : (신장cm - 100) X 0.85
//-
//판정>
//18.5 미만 저체중
//18.5 ~ 22.9  정상
//23.0 ~ 24.9  과체중
//25.0  이상 비만

/*
public class Main {
	
	static String name;
	static double kg;
	static double cm;
	
	
	public static void menu() {
		System.out.println("\n\n----- 메뉴 -----");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 삭제");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 모든 회원 보기");
		System.out.println("5. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	public static void inCustomer() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("몸무게 >> ");
		kg = sc.nextDouble();
		System.out.print("키  >> ");
		cm = sc.nextDouble();
	}
	
	
	public static void main(String[] args) throws IOException{
		
BMIM bs = new BMIM();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			while (true) {  //무한루프 --> 탈출구문
				menu();
				int inNum = sc.nextInt();

				try {
					switch (inNum) {
					case 1:
						System.out.println("\n*-*-*-* 1. 회원 정보 입력 *-*-*-*");
						bs.BMIAdd();
						System.out.println("* 입력완료");
						break;
					case 2:
						System.out.println("\n*-*-*-* 2. 회원 정보 삭제 *-*-*-*");
						bs.display();
						System.out.println("---------------------------");
						System.out.print("삭제할 회원의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						bs.BMIR(inNum);
						break;
					case 3:
						System.out.println("\n*-*-*-* 3. 회원 정보 수정 *-*-*-*");
						bs.display();
						System.out.println("---------------------------");
						System.out.print("수정할 회원의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						System.out.println("수정할 회원의 정보를 입력하세요.");
						inCustomer();
						bs.BMICH(inNum, name, kg, cm);
						break;
					case 4:
						System.out.println("\n*-*-*-* 4. 모든 회원 보기 *-*-*-*");
						bs.display();
						break;
					case 5:
						System.out.println("\n* 프로그램을 종료합니다.");
						System.exit(0);
						break;
					default:
						System.out.println("\nerr)잘못입력하셨습니다. 다시 입력해주세요.");
					} // switch
				} catch (Exception e) {
					System.out.println("err) 없는 회원입니다. 다시 입력해주세요.");
				} // try catch
			} // while
		} catch (Exception e) {
			System.out.println("err) 잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}// try catch

		
		
		int i=0;
		String file;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("읽어 올 파일 이름 입력 요망(절대 경로는 앞에 경로도 입력) : ");
		file = br.readLine();
		
		System.out.println(file + "문서의 내용은 .....");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		while((i= reader.read()) != -1) {
			System.out.println((char)i + " ");
			if( fr.equals("\n")) System.out.println();
		}
		fr.close();
		
	}

	
	
}
*/


public class Main {
	
	static String name;
	static double kg;
	static double cm;
	
	
	public static void menu() {
		System.out.println("\n\n----- 메뉴 -----");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 삭제");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 모든 회원 보기");
		System.out.println("5. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	public static void inCustomer() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("몸무게 >> ");
		kg = sc.nextDouble();
		System.out.print("키  >> ");
		cm = sc.nextDouble();
	}
	
	
	public static void main(String[] args) throws IOException{
		
BMIM bs = new BMIM();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			while (true) {  //무한루프 --> 탈출구문
				menu();
				int inNum = sc.nextInt();

				try {
					switch (inNum) {
					case 1:
						System.out.println("\n*-*-*-* 1. 회원 정보 입력 *-*-*-*");
						bs.BMIAdd();
						System.out.println("* 입력완료");
						break;
					case 2:
						System.out.println("\n*-*-*-* 2. 회원 정보 삭제 *-*-*-*");
						bs.display();
						System.out.println("---------------------------");
						System.out.print("삭제할 회원의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						bs.BMIR(inNum);
						break;
					case 3:
						System.out.println("\n*-*-*-* 3. 회원 정보 수정 *-*-*-*");
						bs.display();
						System.out.println("---------------------------");
						System.out.print("수정할 회원의 번호를 입력하세요 >> ");
						inNum = sc.nextInt();
						System.out.println("수정할 회원의 정보를 입력하세요.");
						inCustomer();
						bs.BMICH(inNum, name, kg, cm);
						break;
					case 4:
						System.out.println("\n*-*-*-* 4. 모든 회원 보기 *-*-*-*");
						bs.display();
						break;
					case 5:
						System.out.println("\n* 프로그램을 종료합니다.");
						System.exit(0);
						break;
					default:
						System.out.println("\nerr)잘못입력하셨습니다. 다시 입력해주세요.");
					} // switch
				} catch (Exception e) {
					System.out.println("err) 없는 회원입니다. 다시 입력해주세요.");
				} // try catch
			} // while
		} catch (Exception e) {
			System.out.println("err) 잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}// try catch

		
		/*
		String str,file;
		Date date = new Date();
		
		str = "파일 생성 시간 \r\n" + date + "\r\n";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 이름 입력 요망(절대 경로는 앞에 경로도 입력) : ");
		file = br.readLine();
		System.out.println("저장할 문자열 입력 요망 : ");
		str += br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		System.out.println("파일을 서공적으로 저장 했습니다.");
*/
	
	
}
}
