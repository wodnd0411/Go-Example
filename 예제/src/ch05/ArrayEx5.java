package ch05;

public class ArrayEx5 {
	
	public static void main(String[] args) {
		int sum = 0; // ������ ����
		double avg = 0; // ������ ���
		
		int[] score = {100, 88, 100, 100, 90}; // ����
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i]; // sum = sum + score[i]
		}
		
		avg = (double)sum / score.length; // double = int / int�̱� ������ ����ȯ
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

}
