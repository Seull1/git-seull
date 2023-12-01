package day08_inheritance02;

public class Grades extends Student{
	int gift;
	char gradeA,gradeB,gradeC,gradeD;
	public int getGift(int gift) {
		return gift;
	}
	public void setGift(int gift) {
		this.gift = gift;
	}
	public char getGradeA() {
		System.out.print("학점 : A ");
		System.out.print("   장학금 : "+getGift(10000000)+"원");
		return gradeA;
	}
	public void setGradeA(char gradeA) {
		this.gradeA = gradeA;
	}
	public char getGradeB() {
		System.out.print("학점 : B ");
		System.out.print("   장학금 : "+getGift(5000000)+"원");
		return gradeB;
	}
	public void setGradeB(char gradeB) {
		this.gradeB = gradeB;
	}
	public char getGradeC() {
		System.out.print("학점 : C ");
		System.out.print("   장학금 : "+getGift(1000000)+"원");
		return gradeC;
	}
	public void setGradeC(char gradeC) {
		this.gradeC = gradeC;
	}
	public char getGradeD() {
		return gradeD;
	}
	public void setGradeD(char gradeD) {
		System.out.print("학점 : D ");
		System.out.print("   장학금 : "+getGift(100000)+"원");
		this.gradeD = gradeD;
	}

	

}
