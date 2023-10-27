package ch05;

public class ArrayEx5 {
	
	public static void main(String[] args) {
		int sum = 0; // 점수의 총합
		double avg = 0; // 점수의 평균
		
		int[] score = {100, 88, 100, 100, 90}; // 점수
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i]; // sum = sum + score[i]
		}
		
		avg = (double)sum / score.length; // double = int / int이기 때문에 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
