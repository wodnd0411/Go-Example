package ch05;

import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		
		// arr[i]�� ���� counter�� �ε��� �� �ϳ��� ����(0 ~ 9)
		// ���� �� ���� ������ 1�� ����
		for(int i = 0; i < arr.length; i++) {
			counter[arr[i]]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "�� ���� : " + counter[i]);
		}
	}

}
