package day07_oop02;

public class Main {
	public static void main(String[] args) {
		
		Point pt=new Point();
		pt.display();
		pt.setX(100);
		pt.setY(100);
		pt.display();
		
		System.out.println("circle object");
		circle c = new circle(); //객체생성,메모리할당,생성자함수 자동호출
		c.display();
		c.setR(3); c.setX(100); c.setY(100);
		c.display();
	}

}
