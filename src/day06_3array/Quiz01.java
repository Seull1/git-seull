package day06_3array;

//3차원 임의적인 데이터 입력받아서 출력하기
public class Quiz01 {
	public static void main(String[] args) {
		//1.
				int[][][] a = new int[2][2][3];  //[면크기][행크기][열크기]
				int x=1;
				//2.
				int	[][][] a2 = new int[][][] {{{1,2,3},{4,5,6}} ,{ {1,2,3 },{4,5,6}}};
				//3.
				int[][][] a3 = {{{1,2,3},{4,5,6}} ,{ {1,2,3 },{4,5,6}}};
				
				System.out.println("면길이 : "+ a3.length);
				System.out.println("행길이 : "+ a3[0].length);
				System.out.println("열길이 : "+ a3[0][0].length);
				System.out.println("열길이 : "+ a3[1][0].length);
				
				// input
				for(int i=0; i<a3.length; i++) {  //면
					for (int j = 0; j < a3[i].length; j++) { //행
						for (int k = 0; k < a3[i][j].length; k++) {
							a[i][j][k] = (int)(Math.random()*100);
							System.out.println(a3[i][j][k]+ "\t");
							
						}
						System.out.println();
					}
					System.out.println();
				}
		
	}

}
