package day07_oop_quiz;

public class Main {
	public static void main(String[] args) {
		tv t=new tv();
		t.display();
		t.setChannel(88); t.setColor("Blue");
		t.display();
		
		tv t2=new tv(2);
		t2.display();
		
	}

}
