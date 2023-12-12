package day15_thread_01;

public class Main {
	public static void main(String[] args) {
		
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
//		t1.run(); //스레드 구현이 아님 그냥 실행한거임
		t1.start();  // run() 유도한다
		t2.start();
		t3.start();
	}

}
