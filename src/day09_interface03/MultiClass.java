package day09_interface03;



import day09_interface02.IDraw;

public class MultiClass implements IDraw ,Test{
	
	String name="이순신";

	@Override
	public void draw() {
		System.out.println("IDraw interface method");

	}

	@Override
	public void tshow(String name) {
		// TODO Auto-generated method stub
		
	}

}
