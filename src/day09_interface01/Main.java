package day09_interface01;

import day09_abstract02.Shape;

interface A{
	int x=9; //interface - abstract method,funal member만 가질수있다
	public void show();  //abstract
	public abstract void disp();
	public int plus(int x,int y);
} // A end

interface B{
	void bview();
}

interface C{             //final 멤버는 초기화 해야한다
	String name="seull"; // final은 초기값 없으면 에러
	public void draw();
	
	//name ="happy";  // final 멤버는 값 변경 금지(상수)
}

interface D extends B{
	void dview();
}

class Rect implements C{

	@Override
	public void draw() {
		System.out.println(name + " 님 반갑습니다.");
		
	}
	
}

//class Multi implements Shape extends Shape B,C,A{  //에러
class Multi extends Shape implements B,C,A{

	@Override
	public void show() {
		System.out.println("A 호출");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int plus(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bview() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(String name) {
		System.out.println("show call"+ name);
		// TODO Auto-generated method stub
		
	}
	
}




public class Main {
	public static void main(String[] args) {
		
		Multi m = new Multi();
		m.bview();
		m.disp();
		m.show();
		
		System.out.println("========="); //부모클래스를 이용해서 객체 생성
		
		Shape m2 = new Multi();
		m2.calc(2);
		
		B m3 = new Multi();// 부모인터페이스를 이용해서 자손클래스 객체 생성
		m3.bview();
		
		C m4 = new Multi();
		m4.draw();
		
		Rect r = new Rect();  //자기 자신으로 객체 생성
		r.draw();  
		C rr = new Rect();   //부모C 인터페스로 객체 생성
		rr.draw();
		System.out.println(rr.name);
	//	A a =new A();  인터페이스라 객체 생성 못함  
		
	}

}
