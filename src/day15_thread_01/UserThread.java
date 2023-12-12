package day15_thread_01;

public class UserThread extends Thread{

	String name;
	
	public UserThread(String name) {
		this.name = name ;
	}
	
	@Override
	public void run() {   //스레드 실행부(구현부)
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5 ; i++) {
			if(i==3) {
				try {
					sleep(3000);  //예외 발생 1/1000 = 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			
			System.out.println(i);
		}
		
		
	//super.run();
	}

	
}
