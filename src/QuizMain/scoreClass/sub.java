package QuizMain.scoreClass;
import java.util.Scanner;

public class sub {
	String name;
	Scanner sc = new Scanner(System.in);
	int kor=0, eng =0, com =0, sum=0;
	double avg;
	char grade;
	
	


	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public sub() {
		name="민민";
	}
	
	public String getN(String name) {
		return name; }
	public void setname(String name) {
		this.name = name;
	}
	

	public void displayN() {
		System.out.println("이름을 입력해 주세요 : ");
		name=sc.next();	
	}
	
	public void display() {
		System.out.println("과목 3개의 점수를 입력하세요 : ");
	
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
		
	}
	

	
	
	
	public void displayG() {
		sum=kor + eng + com;
		double avg = sum / 3.0;
	
		System.out.printf("*******%s 님의 성적표 ******",name);
		System.out.println();
		System.out.printf("국어 : %d 영어 : %d 컴퓨터 : %d",kor,eng,com );
		System.out.println();
System.out.printf("총점 : %d 평균은 : %.2f 이고", sum,avg );
		
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
		System.out.printf("학점 : %s",grade);
		
	}
	
	
}
