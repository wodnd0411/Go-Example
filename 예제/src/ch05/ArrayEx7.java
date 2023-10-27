package ch05;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // �迭 numArr�� ���� 0 ~ 9�� ����
		}
		System.out.println(Arrays.toString(numArr));
		
		// �迭 numArr�� ��ҿ� ���� ������ �������� ����
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random() * numArr.length); // 0 <= n < 10 ���� �� ����
			
			int tmp = numArr[i]; // �ӽ� ���� ���� tmp�� �迭 numArr ����(�ߺ� x)
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
	}

}
