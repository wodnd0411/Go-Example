package ch05;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] score = new int[5]; // 길이가 5인 배열 score
		int k = 1;
		
		// 배열 초기화
		// int[] score = new int[] {50, 60, 70, 80, 90};
		// int[] score = {50, 60, 70, 80, 90};
		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70; // score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k + 2] + score[4]; // score[3] + score[4] = 170
		
		// 배열의 모든 요소 출력
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] = %d%n", i, score[i]);
		}
		
		System.out.println("tmp : " + tmp);
	}
	
}
