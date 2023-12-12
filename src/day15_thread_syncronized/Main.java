package day15_thread_syncronized;

class Atm{
	private int money;

	public Atm(int money) {
		
		this.money = money;
	}
	
	//입금 함수
	public synchronized void deposit(int amount , String name) {
		money += amount;
		System.out.println(name+" 입금금액 : "+amount);
	}
	
	
	//출금 함수
	public void withdraw(int amount , String name) {
		synchronized (this) {
			if((money - amount) > 0) {
				
				Thread.yield();
				
				money -= amount;
				System.out.println(name + " : 출금금액 : "+amount);
			}else {
				System.out.println(name+": 출금 못함(잔액부족");
			}
			
		}// synchronized
	}
	
	public void getMoney() {
		System.out.println("          잔액은 : "+money);
	}
	
	
	
}// Atm end

class UserAtm extends Thread{
	
	Atm obj;
	boolean flag = false;
	
	
	public UserAtm(Atm obj , String name) {
		super(name);
		this.obj = obj;
	}
	
	

	@Override
	public void run() { //스레드 구현부
		
		for (int i = 0; i < 2; i++) {
			
			try {
				sleep(50);	} catch (Exception e) { e.printStackTrace();}
				
				if( flag ) {
					obj.deposit((int)(Math.random() * 10 +2) * 100, getName());
//					obj.getMoney();
				}else {
					obj.withdraw((int)(Math.random() * 10 +2) * 100, getName());
					
				}// if end
				
				flag = true;
				obj.getMoney();
			}// for end
		}
		
		
	}
	




public class Main {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "Seull");
		UserAtm user2 = new UserAtm(at, "김연아");
		UserAtm user3 = new UserAtm(at, "장미란");
		
		user1.start();
		user2.start();
		user3.start();
		
	}

}
