package day07_methodArray;



public class Main {
	
	
	
	public static void main(String[] args) {
		int x =3 , y=5;
		int[][] aarr =methodEx3();
		
		int[] arrresult = methodEx2();
//		for (int i = 0; i < arrresult.length; i++) {
//			System.out.print(arrresult[i] + "\t");
//		}
		
		for(int item : arrresult) {   ///item 에 배열 담기
			System.out.println(item);
			
		}
			
			//---------------------
			// 2차원 배열
			int sum=0;
			
			int[][] resultarr = methodEx3();
			for (int i = 0; i < aarr.length; i++) {
				for (int j = 0; j < aarr.length; j++) {
					System.out.println(aarr[i][j]);
					 sum += aarr[i][j] ;
				}
				
			}
			System.out.println("--------------");
			System.out.println();
			System.out.println(sum);
			for (int[] it : aarr) {
				for(int arritem : it) {
					System.out.println(arritem);
				}
				
			}
			
			System.out.println("---------------");
			int index =0;
			for(int[] it : aarr) {
				System.out.println("index : "+ it);
				System.out.println(it); //데이터 들어 있는 주소 출려됨
				System.out.println(it.hashCode()); // 메모리상의 주소(16진수형태)를 10진수 형태 메모리 주소로 보여줌
			}
			
		
	}
	

	public static int[][] methodEx3() {
			int[][] aarr = {{1,2,3,4},{5,6,7,8}};
			return aarr;
	}


	public static int[] methodEx2() {
		int[] arr = {1,2,3,4,5,6,7,8};
		return arr;
	}

	public static int methodEx(int x, int y) {
		return x+y;
	}

	

	
	
}
