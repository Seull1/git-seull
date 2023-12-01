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







