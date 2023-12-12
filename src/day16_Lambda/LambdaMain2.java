package day16_Lambda;
/*
interface Message{
	int something(int x);  //int 형태 , parameter
}


class Person{
	public void greeting(Message msg) {
		int su = msg.something(55);
		System.out.println("yn : "+su);
	}
}



public class LambdaMain2 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {

			@Override
			public int something(int x) {//일반적인 상태

				System.out.println("Parameter value : " + x);
				return 300;
			}
			
		
		});
		
		System.out.println("------------"); //람다  (매개변수 목록)->{실행문}
//		p.greeting((c) -> {  //위의 변수이름(x) 랑 같지 않아도됨
		p.greeting(c -> {  //매개변수 하나일땐 괄호 안써도됨
			System.out.println("good seull");
			System.out.println("no");
			return c;
		});
		
		p.greeting(c -> 9999);
		
	}

}
*/