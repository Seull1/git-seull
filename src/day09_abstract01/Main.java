package day09_abstract01;

abstract class Shape{ //추상클래스,슈퍼클래스
	double result =0;
	public abstract double calc(); //추상 메소드
	public abstract void drow();
	
	public void show() {  //일반 메소드
		System.out.println("슈퍼 클래스 Shape");
	}
	
}//shape end

class Circle extends Shape{//sub class
	double r =5.0;

	@Override
	public double calc() {
		result = r*r*Math.PI;
		return 0;
	}

	@Override
	public void drow() {
		calc();
		System.out.println("원의 넓이 : "+result+"인 원 입니다.");
		
	}
	
}

class Triangle extends Shape{
	int w =3 ,h=5;
	
	@Override
	public double calc() {
		result = (w*h);
		return 0;
	}

	@Override
	public void drow() {
		calc();
		System.out.println("삼각형의 넓이 : "+ result);
		
	}
	
}


class Rectangle extends Shape{
	int w=3 , h=5, a =2;

	@Override
	public double calc() {
		result = w*h*a;
		return 0;
	}

	@Override
	public void drow() {
		calc();
		System.out.println("사각형의 부피: "+ result);
		
	}
	
}


public class Main {
	public static void main(String[] args) {
//		Shape sh = new Shape(); // 자체적으로 객체 생성불가라 에러
		Circle c = new Circle();
//		c.calc();	
		c.drow();
		new Triangle().drow();
		new Rectangle().drow();
		
	}

}
