package day08_inheritance01;

public class rectangle extends Point {
	private int x2 ,y2;

	
	public rectangle() {
		x=y= 101;
		System.out.println(x+ "," +" " + y);
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void disp2() {
		super.disp();
		System.out.println(x2 +","+ y2);
	}

}
