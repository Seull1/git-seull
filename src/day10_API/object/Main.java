package day10_API.object;

class Point{  }


public class Main {
	public static void main(String[] args) {
		
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : "+pt.getClass());
		System.out.println("hash code : "+pt.hashCode());  //1521118594
		System.out.println("object String : "+pt.toString()); //16진수
		System.out.println("object String : "+ pt); //5aaa6d82
		System.out.printf("10진수 %d\n", 0x5aaa6d82);  //숫자,0 숫자,0x숫자=16진수	
		System.out.println("====================================="); //1521118594
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : "+pt2.getClass());
		System.out.println("hash code : "+pt2.hashCode());   //706277948
		System.out.println("object String : "+pt2.toString()); //16진수
		System.out.println("object String : "+ pt2); //5aaa6d82
		System.out.printf("10진수 %d\n", 0x2a18f23c);  //706277948
		
		System.out.println("pt2.toString() : to String()의 의미 - day10_API.object.Point@2a18f23c");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
	
		Point pt3 = new Point();
		
		if(pt.hashCode() == pt3.hashCode()) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		Point pt4;
		pt4=pt;
		
		if(pt.hashCode() == pt4.hashCode()) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		System.out.println(pt.hashCode() + "," + pt4.hashCode());
		
		
	}// main end
	
}
