package day08_inheritance01;

public class Point {
	protected int x , y;  // protected = 다른패키지에 있어도 상속받은 애들은 사용할수있다
	
	public Point() {
		x = y = 100;
		System.out.println("Point default constructor call");	
	}
	
	
	
	public Point(int x) {
		this.x =x;
		System.out.println("Point 1개 default constructor call");	
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.print(x + ", " + y);
	}


	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point 2개 default constructor call");	
	}



	public static void main(String[] args) {
		
	}

}
