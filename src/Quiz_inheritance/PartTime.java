package Quiz_inheritance;



public class PartTime extends Regular{
	
	protected int day ,P;
	
	

	public int getP() {
		return P;
	}

	public void setP(int p) {
		P = p;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	
	public PartTime() {
		day=25;
		P=day*pay;
		
	}
	
	
	public PartTime(int day) {
		super();
		this.day = day;
	}
	
	public void disp() {
		
		System.out.println("일한 날짜 : "+ day+"일"+"   파트타임 급여 : " +P+"달러");
	}
	

}
