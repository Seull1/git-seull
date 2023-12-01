package Quiz_inheritance;

public class sales extends PartTime{
	double money ;  // 주휴수당
	

	public double getMoney() {
		money = (day > 24)?P+P*0.1:P;
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void disp() {
		System.out.println("주휴수당 : 10%" + "     최종 급여: "+ getMoney());
	}
	
	

}
