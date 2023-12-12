package day16_Lambda;
/*

interface Message{
	void something();  //void 형태
}


class Person{
	public void greeting(Message msg) {
		msg.something();
	}
}



public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {

			@Override
			public void something() {//일반적인 상태

				System.out.println("good seull");
				System.out.println("nono");
			}
			
		
		});
		
		System.out.println("------------"); //람다  ()->{}
		p.greeting(() -> {
			System.out.println("good seull");
			System.out.println("nono");
		});
		
	}
}
*/