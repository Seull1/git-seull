package day07_methodStatic;

/*
static method : 객체 생성 없이 바로 사용 가능ㅎ함
		objectName.methodName()
		
		ClassName.methodName()


*/

class A{
	int  x,y;
	
	//staatic mathod
	public static void setData(int xx,int yy) {
		System.out.println(xx + "," + yy);
	}
}// A class end




public class Main {
	public static void main(String[] args) {
		A.setData(3,5);
		A obj = new A();  // 객체 생성,메모리에 할당 ,생성자함수 자동호출
		obj.x=9;
		System.out.println(obj.x);
		obj.setData(1, 2);
	}

}
