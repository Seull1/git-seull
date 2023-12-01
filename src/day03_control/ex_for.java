package day03_control;


// 초기값,증감식은 2개 이상기재 가능(단, 조건은 오직1개여야함) 
// 초기값,증감식은 생력가능 (단, 조건은 생략불가,생략하면 무한루프)

/*
public class ex_for {
	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++) {
			System.out.println("매우 졸려요!");
		}
		
		for(int i=1; i<=100; i++)  {
			System.out.print(i + "\t");			
			if(i % 10 == 0)  System.out.println("");
			
		}
		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
	}

}
*/

/*
//무한 루프
public class ex_for {
	public static void main(String[] args) {
		for(;;) System.out.println();
	}
}
*/

/*
public class ex_for {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}// j end
			System.out.println("");
		}// i end
	}
}
*/
