package day09_staticMember;


class Atm{
	int count;  //instance member
	static int total; //static member
	
	public Atm(int amount) {  //constructor
		count += amount;
		total += amount;
	}
	
	public static void view() {
		//count = count +100;  ///스택틱 method에서는 일반 멤버는 사용할수 없다
		total = total +100;
	}
	
	public void disp() {
		count = count +100;  ///instance method에서는 둘다 사용가능하다 
		total = total +100;
		System.out.println("count = "+ count);
		System.out.println("total = "+ total);
	}
	
}// Atm class end


public class Main {
	public static void main(String[] args) {
		
		Atm at = new Atm(1000);
		at.disp();  //
		System.out.println("==========");
		Atm at2 = new Atm(500);
		at.disp();
		
	}

}
