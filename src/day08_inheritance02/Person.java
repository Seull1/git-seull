package day08_inheritance02;
import java.util.Scanner;


public class Person {
	protected int age;
	protected String name,gender;
	Scanner sc = new Scanner(System.in);
	
	
	public Person() {
		
	}
	
	public Person(String name , String genger , int age) {
		System.out.println("이름을 입력하세요 :");
		name=sc.next();
		System.out.println("성별을 입력하세요 :");
		gender = sc.next();
		System.out.println("나이을 입력하세요 :");
		age = sc.nextInt();
		
	}
	
	
	protected void input(){
		System.out.println("이름을 입력하세요 :");
		name=sc.next();
		System.out.println("성별을 입력하세요 :");
		gender = sc.next();
		System.out.println("나이을 입력하세요 :");
		age = sc.nextInt();
		
		
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
//	public void disp() {
//		System.out.printf("이름 : %s  성별 : %s  나이: %d",name,gender,age);
//	}

}
