package day12.Quiz.video;

import java.util.ArrayList;
import java.util.Scanner;

public class Video extends Customer{
	
	ArrayList list = new ArrayList();
	
	Video(){
		
	}
	
	Video(String title,String category, char lend){
		Customer c = new Customer(title ,category,lend);
		list.add(c);
	}
	
	public void VideoAdd(String title,String category,char lend) {
		Customer c = new Customer(title,category,lend);
		list.add(c);
		
	}

	public void VideoAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비디오 이름 : ");
		title = sc.next();
		System.out.println("장르 : ");
		category = sc.next();
		System.out.println("대여 여부(Y or N) : ");
		lend  = sc.next().charAt(0);	
		System.out.println("고객이름 : ");
		name = sc.next();
		System.out.println("대여 일자 : ");
		date = sc.next();
		
		Customer c = new Customer(title,category,lend);
		list.add(c);
	}
	
	
	public void display() {
		System.out.println("저장된 비디오 수 :" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("- " + (i+1)+"번 -");
			((Customer) list.get(i)).Vdisplay();
		}
	}

	public void CustomerRmv(int i) {
		System.out.println("\n\n* 삭제된 고객");
		((Customer)list.get(i - 1)).Vdisplay();
		System.out.println("--------------");
		list.remove(i - 1);
		
	}

	public void CustomerCh(int inNum, String title, String category, char lend) {
		
		
	}
	
	
	
	
}
