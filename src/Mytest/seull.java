package Mytest;

import java.util.Scanner;

/*
// homeowrk 02

public class seull {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 개수를 입력하세요 : ");
		int x = sc.nextInt();
		int[] num = new int[x];
		int count = 0;

		System.out.println("숫자를 입력하세요 : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("찾고싶은 숫자를 입력 하세요 : ");
		int y = sc.nextInt();
		for (int i = 0; i < x; i++) {
			if (y == num[i])
				count++;
		}
		System.out.println(count);
	}
}
*/

/*
//homework 3

public class seull {
	public static void main(String[] args) {
		int x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		int n[][] = new int[x][y];
		int m[][] = new int[x][y];
		int sum[][] = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				n[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				sum[i][j] = n[i][j] + m[i][j];
				System.out.printf("%d\t", sum[i][j]);
			}
			System.out.println();
		}

	}
}
*/

/*
//homework 5
public class seull {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		for (int k = 0; k < r; k++) {

			int n = sc.nextInt();
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int i = 0; i < n; i++) {
					System.out.print(s.charAt(j));
				}

			}
			System.out.println();
		}

	}
}
*/

/*
//homework6
public class seull {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ch;
		char x = ' ';

		int count = 1;
		ch = sc.nextLine();

		for (int j = 1; j < ch.length(); j++) {
			if (ch.charAt(j) == x)
				count++;
		}

		System.out.println(count);

	}

}
*/

/*
//homework 7

public class seull{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		int reword = 0;
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}// for end
		System.out.println("===============");
		//주사위가 1~6 사이가 아닐때
		if(a[0]>6 || a[1]>6 || a[2]>6 ||a[0]<1 ||a[1]<1 ||a[2]<1) {
			System.out.println("주사위는 1~6 사이를 입력해 주세요.");
		}else { 
			if (a[0] == a[1] && a[0] == a[2])  //주사위 3개 참
				reword = 10000 + (a[0] * 1000);
			else if (a[0] == a[1] || a[0] == a[2] || a[1] == a[2]) { //주사위2개참
				if (a[0] == a[1] || a[0] == a[2]) reword = 1000 + (a[0] * 100);
				else reword = 1000 + (a[2] * 100);
			} else { // 주사위 서로다를때
				if (a[0] >= a[1] || a[0] >= a[2]) reword = a[0] * 100;
				else if (a[1] >= a[0] || a[1] >= a[2]) reword = a[1] * 100;
				else reword = a[2] * 100;
			}
		System.out.println("상금 : "+reword);
		}
	}// main end
}
*/

//homework 8

/*
public class seull{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y,a=0,sum,num ;
		num =sc.nextInt();
		y = sc.nextInt();
		int[] x = new int[num]; 
		
		for (int i = 0; i < num; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			for (int j = i+1; j < num; j++) {
				for (int k = j+1; k < num; k++) {
					sum=x[i]+x[j]+x[k];
					if(y <= sum && sum <=y)
						a=sum;
						
					
				}
				
			}
			
		}// if end
		System.out.println(a);
		

	}
}
*/



//homework 9

/*
public class seull{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1=0;
		int su2=0;
		int a=0;
		int x =sc.nextInt();
		
		int[] n1 = new int[x];
		int[] n2 = new int[x];
		
		for (int i = 0; i < x; i++) {
			n1[i] = sc.nextInt();
			n2[i] = sc.nextInt();
		
			
			for (int j = 0; j <45001; j++) {
				for (int k= 0; k < 100; k++) {
					su1=n1[i]*j;
					su2=n2[i]*k;
					if(su1 == su2) a= su1;
					if(a!=0) break;
				}
			
				
			}
			System.out.println(a);
		}
	}
}
*/


//homework 10






/*

public class seull {
	public static void main(String[] args) throws Exception {
	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x =  Integer.parseInt(br.readLine());
		int[] str = new int[x];
        
		System.out.println("숫자"+ x +" 개를 입력 하세요 : ");
		for (int i = 0; i < x; i++) {
			str[i] =  Integer.parseInt(br.readLine()); // 예외발생
		}
		Arrays.sort(str);
		for (int i = 0; i < x; i++) {
			System.out.println(str[i]);
		}
	}

}

*/







/*
 public class seull {
	public static void main(String[] args) throws Exception {
	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자 2개 입력 하세요 : ");
		int str =  Integer.parseInt(br.readLine()); // 예외발생
		int str2 =  Integer.parseInt(br.readLine());
		
//		int str3 =  System.in.read();
		
		System.out.println(str);
		System.out.println(str2);
		
	
	}

}
 */


//homework 11
/*
public class seull{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> n = new Stack<>();
		int a;
		System.out.println("명령 실행횟수를 입력하세요");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
		int x= sc.nextInt();
			
		switch (x) {
		case 1: a = sc.nextInt();
		n.push(a); break;
		case 2: if(!n.isEmpty()) System.out.println(n.pop());
		else System.out.println("-1"); break;
		case 3: if(!n.isEmpty()) System.out.println(n.size());
		else System.out.println("비어있슴"); break;
		case 4: if(n.isEmpty()) System.out.println("1");
		else System.out.println("0"); break;
		case 5: if(!n.isEmpty()) System.out.println(n.peek());
		else System.out.println("-1"); break;

		default: System.out.println("1~5 까지만 입력해주세요.");
			break;
		}
		}// for end
	}
}
*/


//homework 12

/*

public class seull{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수 입력 : ");
		int n = sc.nextInt();
		if(n>=1 && n<=100) {
		System.out.println("상받을 인원 : ");
		int k = sc.nextInt();
		if(k>=1 && k<= n) {
		Integer[] score = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			if(score[i] >=1 && score[i] <= 10000) {
				
			}else System.out.println("점수는 1이상 10000이하로 입력해주세요");
			}// for end
		Arrays.sort(score,Collections.reverseOrder());
		System.out.println(score[k-1]);
		}else System.out.println("상받을 1이상 인원은 학생수보다 적게 입력해주세요");
		}//if end
		else {System.out.println("학생수는 1~1000사이 입력해주세요");}
		
	}// main end
} // class end
*/

/*
public class seull{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수 입력 : ");
		int n = sc.nextInt();
		System.out.println("상받을 인원 : ");
		int k = sc.nextInt();
		Integer[] score = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}// for end
		Arrays.sort(score,Collections.reverseOrder());
		System.out.println(score[k-1]);
		
	}// main end
} // class end
*/


/*
//homework 13

public class seull{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =2;
		int[] a = new int[200];
		int[] b = new int[200];
		
		int[] n =new int[2];
		for (int i = 0; i < 2; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[0]; j++) {
				a[j]=sc.nextInt();	
			}
			for (int j = 0; j < n[1]; j++) {
				b[j] = sc.nextInt();
			}
			if(a.equals(i)-b.equals(i))
		}
			
		}
	
			
			
}
*/


//homework 14

public class seull{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=5;
		
		System.out.println("숫자 하나를 입력해주세요 : ");
		x= sc.nextInt();
		if(x >= 0 && x <= 12)
		System.out.println(fac(x));
		else System.out.println("1~12까지의 숫자를 입력하세요.");
	}
	
	public static int fac(int x){
		if(x ==0) 
			return 1;
		else {
			return x * fac(x-1);
		}
	}
}










