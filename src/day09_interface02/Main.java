package day09_interface02;

public class Main {
	public static void main(String[] args) {
		
		// 1.
		BB b =new BB();
		b.draw();
		b.show();
		
		// 2.
		IDraw bb = new BB();
		bb.draw();
	}

}
