package Quiz_inheritance;

public class Regular extends employee{
	protected int pay;

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public Regular() {
		pay=300;
	}
	
	public void disp() {
		System.out.println("시간당 급여(달러) : "+pay);
	}
}
