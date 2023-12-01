package day04_control_while;

/*
public class break_continue {
	public static void main(String[] args) {
		
		for(int i =1 ; i < 11; i++) {
			if( i == 7 ) break;
			System.out.println(i);
		}
		System.out.println();
		for(int i =1 ; i < 11; i++) {
			if( i == 7 ) continue;
			System.out.println(i);
		}
		
		System.out.println();
		for(int i =1 ; i < 11; i++) {
			if( i % 2 !=0 ) continue;
			System.out.println(i);
	}
	}
}
*/

// break label//////////////////////////////////////
// break 는 가장 가까운 {}을 빠져나가고 break label은 바깥쪽을 빠져나간다
public class break_continue {
	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			aa: for (int j = 1; j < 6; j++) {
				if (j == 3)
					break aa;
				System.out.println("i = " + i + "  , j = " + j);
			}
		}
	}
}