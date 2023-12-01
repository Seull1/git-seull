package day10_Enum;

enum Day {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,
	THURSDAY,FRIDAY,SATURAY
}


public class Test {
	Day day;
	
	public Test(Day day) {
		this.day =day;
	}
	
	
	public void telltLikeItIs() {
		switch(day) {
		case MONDAY:
			System.out.println("MONDAY so bad");
			break;
		case FRIDAY:
			System.out.println("FRIDAY so better");
			break;
		case SATURAY:
			System.out.println("SATURAY so best");
			break;
			
			default:
				System.out.println("soso");
				break;
		}
	}
	
	
}


