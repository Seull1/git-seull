package day06_3array;

import java.util.Arrays;

/*
// 정렬
// 선택 솔트 : 기준 있슴
public class Sort {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int temp;
		
		System.out.println("******* sort 전 출력*******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			
		}
		// sort
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} // if end
				
			}// j end	
		} // i end
		System.out.println();
		System.out.println("******* sort 후 출력*******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		
	}
	}
}
*/

// ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
/* 
//버블 솔트
public class Sort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 2, 5, 8 };
		int temp;

		System.out.println("******* sort 전 출력*******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		// sort
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {

				if (a[j] < a[i + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
			
		}
		System.out.println();
		System.out.println("******* sort 후 출력*******");
		for (int i = 0 ; i <a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
*/

public class Sort{
	public static void main(String[] args) {
		int[] a = { 7, 3, 2, 5, 8 };
		
		System.out.println("******* sort 전 출력*******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		//sort
		System.out.println("\n 오름차순");
		Arrays.sort(a);
		
		System.out.println();
		System.out.println("******* sort 후 출력*******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n 내림차순");
		for (int i = a.length-1 ; i > 0; i--) {
			System.out.print(a[i] + "\t");
		}
	}
}