package day14_io_Quiz;

import java.util.ArrayList;
import java.util.Scanner;

import Quiz.collection.list2.Customer;

public class BMIM extends BMI{
	
	ArrayList<BMI> list = new ArrayList<BMI>();
	
	BMIM(){
		
	}
	
	BMIM(String name ,double kg, double cm){
		BMI b = new BMI(name,kg,cm);
		list.add(b);
	}
	
	
	
	public void BMIAdd(String name ,double kg, double cm){
		BMI b = new BMI(name,kg,cm);
		list.add(b);
	}
	
	public void BMIAdd() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("몸무게 >> ");
		kg = sc.nextDouble();
		System.out.print("키  >> ");
		cm = sc.nextDouble();
		
		BMI c = new BMI(name, kg, cm);
		list.add(c);
	}
	
	
	public void BMIR(int i) {
		System.out.println("\n\n* 삭제된 회원");
		list.get(i-1).display();
		System.out.println("----------");
		list.remove(i-1);
	}

	public void BMICH(int i, String name, double kg, double cm) { // 수정
		BMI b = new BMI(name, kg, cm);
		list.set(i - 1, b); // 교체
	}
	
	
	public void display() {
		System.out.println("저장된 회원 수 : "+ list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("- " + (i + 1) + "번 -");
			list.get(i).display();
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
