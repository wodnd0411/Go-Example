package ch06;

import java.util.Arrays;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 6, 5, 4};
		
		printArr(arr); // �迭 arr ���
		sortArr(arr); // �迭 arr ����(��������)
		printArr(arr);
		System.out.println("sum = " + sum(arr)); // �迭 arr�� ��� ��ҵ��� ��
	}
	
	static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	static void sortArr(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
	static int sum(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

}
