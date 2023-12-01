package homwork;
import java.util.Random;


//과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
//과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
//과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?  7.07
//과제4] 3개 정수 입력 받아서 큰 순으로 출력하기




//과제]3
/*
public class day23_11_23{
	public static void main(String[] args) {
		float sum =0;
		
		for (int i = 1; i <= 9; i++) {
			for (float j = i+1; j <=10; j++) {
				sum = sum + i/j;
				break;
			}
		}
		System.out.println(sum);
	}
}
*/

//과제]2
/*
public class day23_11_23 {
	public static void main(String[] args) {

		int sum = 0, x = -1;

		for (int i = 1; i <= 10; i += 2) {
			sum = sum + i * x;
		}
		for (int i = 0; i <= 10; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
*/

// 과제]1
/*
public class day23_11_23{
	public static void main(String[] args) {
		
		int sum=0,x=0 ;
		
		for(int i=1; i<=5; i++) {
					sum=sum+i;
					x=x+sum;
					System.out.println(x);
		}
	}
}
*/



/*
public class day23_11_23 {
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int num1 = x.nextInt();
		int num2 = x.nextInt();
		int num3 = x.nextInt();
		
		if(num1 > num2){
			if(num2 > num3) { System.out.println(num1+" "+" "+ num2+" "+" "+num3);
			}else {
				System.out.println(num1+" "+" "+ num3+" "+" "+num2);
			}
				
			}else if(num1 > num3) {
				if(num2 > num3) { System.out.println(num1 + num2 + num3);
				}else {
					System.out.println(num1 + num3 + num2);
				}
				
			}
	}
}
*/
/*
public class day23_11_23{
	public static void main(String[] args) {
		System.out.println("숫자 3개 입력하세여 : ");
		Scanner x = new Scanner(System.in);
		int n1 = x.nextInt();
		int n2 = x.nextInt();
		int n3 = x.nextInt();
		int a ,b,c;
		
		
		a = (n1>n2) && (n1>n3) ? n1 : ( n2 > n3 ? n2 : n3 ) ;
		c = (n1<n2) && (n1<n3) ? n1 : ( n2 > n3 ? n3 : n2 );
		b = (n1+n2+n3) -a -c;
	
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
*/

public class day23_11_23{
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt(5));
	}
}