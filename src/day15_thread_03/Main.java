package day15_thread_03;

public class Main {
	public static void main(String[] args) {
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
//		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		
		System.out.println("현제 스레드 ID : "+id);
		System.out.println("현제 스레드 이름 : "+ name);
		System.out.println("현제 스레드 우선순위 : "+ priority);
		System.out.println("현제 스레드 State : "+ state);
	}

}
