package ch05;

import java.util.Arrays;

public class ArrayEx9 {

	// ���������� �̿��� ũ������� ����
	public static void main(String[] args) {
		int[] arr = new int[10];
		int tmp = 0; // �ӽ÷� ���� �� ����
		
		// 0 ~ 9 ���ڵ��� �������� �迭 arr�� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		
		// �迭 ��ҵ��� ��
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				// arr[j]�� �ٷ� ���� ��� arr[j + 1]�� ��
				if(arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		// �������� �� �迭 arr ���
		System.out.println(Arrays.toString(arr));
	}

}
