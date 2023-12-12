package day16_Lambda;

//타입을 써야할 상황일때
interface Message{
	void something(int x , int y);  //int 형태 , parameter 여러개
}

interface Talk{
	void something(String x , String y);// functional interface
}

class Person{
	public void greeting(Message msg) {
		msg.something(1 , 2);
	}
	public void gerrting(Talk msg) {
		msg.something("hihi", "gdgd");
	}
}



public class LambdaMain4 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {
			@Override
			public void something(int x , int y) {//일반적인 상태

				System.out.println("Parameter value : " + x+" , "+y);
			}
			
		
		});
		
		System.out.println("------------"); //람다  (매개변수 목록)->{실행문}
		char ch = 'A';
//		p.greeting((c) -> {  //위의 변수이름(x) 랑 같지 않아도됨
//		p.greeting((int x ,int y) -> {  //매개변수 하나일땐 괄호 안써도됨
		p.gerrting((String x ,String y) -> {
			System.out.println(x+" , "+y);
			System.out.println("------------");
			
//			ch ='B'; //람다는 값 변경할수 없슴
			num=12345;  //static 변수는 값 변경 가능하다
			System.out.println(num);
		});
		
	}
	
	static int num = 30;
	

}
