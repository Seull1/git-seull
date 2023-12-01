package day06_3array;
import java.util.Scanner;

import QuizMain.Score;

//주어진 2차원 배열 점수의 총점/평균 구하시오
public class quiz_2array_score {
	public static void main(String[] args) {
		int  [][] score = { { 98, 98, 90, 92, 99 },
				{ 81, 82, 83, 84, 85 },
				{ 71, 73, 75, 77, 79 },
				{ 60, 65, 60, 65, 69 },
				{ 77, 74, 79, 78, 72} };
		int[] sum= new int[5];
		float[] avg= new float[5];
		int total =0;
		float avgall =0;
		
		for (int i = 0; i < score.length; i++) {
			
			for (int j = 0; j < score.length; j++) {
				sum[i] += score[i][j];
				avg[i] = sum[i] / score[j].length;
				
				total += sum[i];
				avgall += avg[i];
			}
				
			System.out.println("총합 : "+sum[i]+"  평균 : "+ avg[i]);
			
		}
		System.out.println("전체 총합 : "+total+"  학급전체 평균 : "+avgall);
		
	}

}
