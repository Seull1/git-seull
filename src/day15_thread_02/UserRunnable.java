package day15_thread_02;

public class UserRunnable implements Runnable {
	
	String name;
	public UserRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {  //스레드 실행부(구현부)
		
//		System.out.println("runnable run() 호출");
		
		for (int i = 1; i < 6; i++) {
			
			if( i== 4 ) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
		

	}

}
