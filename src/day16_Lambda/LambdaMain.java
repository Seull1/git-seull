package day16_Lambda;

/*
interface Message{
	int something();  //int 형태
}


class Person{
	public void greeting(Message msg) {
		int su = msg.something();
		System.out.println("yn : "+su);
	}
}



public class LambdaMain {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {

			@Override
			public int something() {//일반적인 상태

				System.out.println("good seull");
				System.out.println("nonono");
				return 300;
			}
			
		
		});
		
		System.out.println("------------"); //람다  (매개변수 목록)->{실행문}
		p.greeting(() -> {
			System.out.println("good seull");
			System.out.println("no");
			return 50;
		});
		
	}

}
*/