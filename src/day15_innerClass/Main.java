package day15_innerClass;

class OuterClass{  //외부클래스라고 지정
	
	static int no;
public static InnerClass InnerClass;
	String message = "hello~~";
	
	public void outerMethod() {
		System.out.println("outer method call~");
	}
	
	class InnerClass{  //내부 클래스
		
		int su =99;
		
		public void show() {
			System.out.println(su);  //내부(자신의 것) 사용가능
			System.out.println(message); //외부 클래스 멤버 사용가능
		}
		
		public void disp() {
			outerMethod();  //외부 클래스 메소드 호출
		}
		
		
	}// inner end
	
	
	
}//outer class end








public class Main {
	public static void main(String[] args) {
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();
		inner.show();
		System.out.println("----------");
		
		
		//2.
//		OuterClass.InnerClass inner( )
		
	}

}
