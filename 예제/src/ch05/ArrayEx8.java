package ch05;

import java.util.Arrays;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int index = 0; // ���� �ε����� ���� ����
		
		// 1 ~ 10�� �������� �� ����
		for(int i = 0; i < num.length; i++) {
			index = (int)(Math.random() * num.length); // 0 ~ 9 ����
			
			num[i] = num[index]; // num[0]���� ���ʴ�� ������ ������ �������� ����(�ߺ� o or x)
		}
		
		System.out.println(Arrays.toString(num));
	}
}
