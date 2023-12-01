package day08_inheritance02;
import java.util.Scanner;

public class Student extends Person{
	
	protected int jumsu;
	Person p = new Person();

	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}

	public Student() {
		
	}
	public void input() {
		System.out.println("이름을 입력하세요 :");
		name=sc.next();
		System.out.println("성별을 입력하세요 :");
		gender = sc.next();
		System.out.println("나이을 입력하세요 :");
		age = sc.nextInt();
		System.out.println("점수를 입력하세요 :");
		jumsu=sc.nextInt();

	}

	
	public void disp() {
		
		System.out.printf("이름 : %s  성별 : %s  나이: %d ",name,gender,age);
	}
	
}
