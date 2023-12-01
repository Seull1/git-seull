package ex01.oprator;
// 최단산쉬관논삼대콤

/*
public class MainEntry {
	public static void main(String[] args) {
		//단항연산자: 증감==> ++ , --,~ ...
		int x =10,y;
		
		y=++x;  //전위연산:연산먼저, 대입나중
//		y=x++;  //후위 연산:대입먼저,연산나중
		
		y=x--;
		;
		System.out.println("x = " + x +  " , y= "  +y );
	}

}
*/

/*
public class MainEntry {
	public static void main(String[] args) {
		// 
		int x =10, y;
		y=~x;      // 비트부정           -(원래값 +1) ==> 결과
		System.out.println("x = " + x +  " , y= "  +y );
		// 
		
		// 산술 연산자 : + , - , * , / , % , ...
		// 정수의 결과는 무조건 정수!
		int x=10 , y=20;
		int gob = x*y;
		
		System.out.println("x * y = " + gob);
		System.out.println("x * y = " + (x*y));
		System.out.println("----------------------------");
		System.out.println("3+4*5" + (x*y));

		System.out.println("7/3 = " + (7/3));    // 2 , 몫만 출력
		System.out.println("7%3 = " + (7%3));    // 1 , 나머지만 출력
		System.out.println("7/3.0 = " + (7/3.));    //  실수 연산할땐 . 붙여주기
		
	}
}
*/

/*
public class MainEntry {
	public static void main(String[] args) {
		//shift 연산자 : << , >> , >>>
		
		int x =8 , result;
		
//		result = x << 2; // left shift   2bit를 왼쪽으로 밀기(2진수 8을 왼쪽 두번밀기)
		// 0000 1000 을 0010 0000 으로 만든다      계산법:원래값 * 2 ^ bity수
		
		result = x >> 3;  //right shift             계산법:원래값 / 2 ^ bity수
		
		System.out.println(result);
	}

}
*/

/*
public class MainEntry {
	public static void main(String[] args) {
		//관계연산자 : > , < , >= , <= , == ,!=
		int x=3 , y= 5;
		
		boolean flag = true;

		System.out.println(flag);
		System.out.println(!flag);
		
		if( x> y) {
			System.out.println("max : " + x);
		}else {
			System.out.println("max : " + y);
		}
	}
*/
          /// 모든 연산자 중 !이 가장 위의 연산자
/*   ///2진 논리
public class MainEntry {
	public static void main(String[] args) {
		// 논리연산자 : & (and) , | (or)  , ^ (xor)    2진 논리 ==> 결과 : 값
		int x =4 , y=7;
		
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		
	}
}
*/


public class MainEntry {
	public static void main(String[] args) {
		// 논리연산자 : && (and) , || (or)  , ! (not)    10진 논리 ==> 결과 : 참 or 거짓
		int x =4 , y=7 , z= 10 ;
		
		boolean result =true;
		
		result = (x<y) && (y>z);  //  '&&' 연산은 앞에 것이 '거짓' 이면 뒤는 수행X
		System.out.println("&& : " + result);
		
		result = (x<y) || (y>z);  //  '||' 연산은 앞에 것이 '참' 이면 뒤는 수행X
		System.out.println("|| : " + result);
		
		System.out.println("! : " + !result);
		
	}
}