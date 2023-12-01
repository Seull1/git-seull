package day10_Enum;

public class Main {
	public static void main(String[] args) {
		
		Test day1 = new Test(Day.MONDAY);
		day1.telltLikeItIs();
		
		Test day2 = new Test(Day.SUNDAY);
		day2.telltLikeItIs();
		
		Test day3 = new Test(Day.FRIDAY);
		day3.telltLikeItIs();
		
	}

}
