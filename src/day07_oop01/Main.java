package day07_oop01;

class Point{
	private int x,y ; // 멤버 변수// private 안쓰면 이름이 다른거랑 겹치면 에러남
	
	//멤버함수
	public void setX(int xx) { x= xx;}
	public int getX() {return x;}
	public void setY(int yy) { y= yy;}
	public int getY() {return y;}
	public void display() {
		//System.out.println(x + ","+ y);
		System.out.println(getX() + "," + getY());
	}
	
}//point end

class circle{
	private int x , y , r;
	//getter  / setter
	public void setX(int xx) { x=xx;}
	public int getX()	{return x;}
	public void setY(int yy) { y=yy;}
	public int getY()	{return y;}
	public void setR(int rr) { r=rr;}
	public int getR()	{return r;}
	
	//output
	public void display() {
		System.out.println(x+ "," + y + "," + r );
	}
}// circle end


public class Main {
	public static void main(String[] args) {
		//circle 객체 생성해서 출력하기
		circle c = new circle();
		c.display();
		c.setR(5);  c.setY(100);  c.setX(150);
		c.display();
		
		System.out.println("====================================");
		Point pt = new Point(); //객체 생성,메모리할당,생성자함수 자동호출
		System.out.println(pt.getX());
		pt.setX(77);
		System.out.println(pt.getX());
		pt.display();
//		pt.x=3;
//		pt.y=5;
//		System.out.println(pt.x + ","+pt.y);
	}
}
