package day07_mathod_Instance;

/*
 instance method:객체 생성하고 사용해야함
 */
class B{
	int x ,y;
	
	public void setData(int xx, int yy) {  //instance  메소드는 static 안붙임
		System.out.println(xx + ","+ yy);
	}
	
}//B clss end



public class Main {
	public static void main(String[] args) {
		B seull =new B(); // 객체생성,메모리할당,생성자 함수 자동호출
		seull.setData(100, 200);
	}

}
