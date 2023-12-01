package day09_interface02;

public class BB implements IDraw {

	public void draw() {
		System.out.println("BB 클래스에서 인터페스으IDraw의 메소드를 오버라이드함");
		System.out.println(su);
	}

	public void show() {
		System.out.println(su);
		//su=3000;  값변경 금지(안됨)
	}
}
