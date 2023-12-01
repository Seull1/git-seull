package Quiz_inheritance;



/*
 *문제1]    employee  <----- regular <------ sales
 *사번,이름,부서,연락처       급여           커미션
 */
public class employee {
	protected int num,dept;
	protected String name,cal;

	public employee() {
		num=7841;
		dept=11;
		cal="010-789-4641";
		name = "seull";
		
	}
	public employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public employee(int num, int dept) {
		super();
		this.num = num;
		this.dept = dept;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public String getCall() {
		return cal;
	}

	public void setCall(String call) {
		this.cal = cal;
	}
	
	public void disp() {
		System.out.printf("이름 : %s 사번 : %d 부서 : %d 연락처 : %s",name,num,dept,cal);
	}

}
