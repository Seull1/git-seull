package day07_oop02;

public  class Point {
	private int x,y;
	
	public Point() {
	
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

 
	public Point(int y) {
		super();
		this.y = y;
	}


	public void setX(int xx) {x=xx;}
	public int getX() {return x;}
	public void setY(int yy) {y= yy;}
	public int getY() {return y;}

		public void display() {
			System.out.println(x + "," +y);
		}

	}


