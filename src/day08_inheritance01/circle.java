package day08_inheritance01;

public class circle extends Point {
	private int  r;
	
	
	// 자동 오버라이딩 Source-> Generate to String
	@Override
	public String toString() {
		return "circle [r=" + r + "]";
	}
	

	circle() {
		r=5;
		System.out.println("Circle default constructor");

	}


	public circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
		System.out.println("Point 3개 default constructor call");
	}

	public circle(int r) {
		super();
		this.r = r;
		System.out.println("Point 1개 default constructor call");
	}
	

	public void disp(){
		super.disp();//super class 에 접근
		System.out.print(", " + r);
	}
	
}
