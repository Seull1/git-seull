package day06_method00;
// 가변길이
public class argument {
	
	public static void plus(int ...x) { //가변길이 배열
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
			
		}
		System.out.println(sum);
	}
	
//	public static void plus(int x , int y , int z) {
//		int hap = x+y+z;
//		System.out.println(hap);
//	}
//	
//	public static void plus(int x , int y) {
//		int hap = x+y;
//		System.out.println(hap);
//		
//	}
	
	public static void main(String[] args) {
		plus(1,2,3,4,5,6);
		plus(1,2);
		plus(1,2,3);
	}

}
