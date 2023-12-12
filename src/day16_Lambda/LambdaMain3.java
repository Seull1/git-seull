package day16_Lambda;
/*
interface Message{
	int something(int x , int y);  //int 형태 , parameter 여러개
}


class Person{
	public void greeting(Message msg) {
		int su = msg.something(1 , 2);
		System.out.println("yn : "+su);
	}
}



public class LambdaMain3 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {

			@Override
			public int something(int x , int y) {//일반적인 상태

				System.out.println("Parameter value : " + x+" , "+y);
				return 300;
			}
			
		
		});
		
		System.out.println("------------"); //람다  (매개변수 목록)->{실행문}
//		p.greeting((c) -> {  //위의 변수이름(x) 랑 같지 않아도됨
		p.greeting((x ,y) -> {  //매개변수 하나일땐 괄호 안써도됨
			System.out.println("good seull");
			System.out.println("no");
			return  x + y ;
		});
		p.greeting((x,y) -> x+y);
		p.greeting((x ,y) -> 1234);
		
	}

}
*/