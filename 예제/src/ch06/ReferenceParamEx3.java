package ch06;

import java.util.Arrays;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 6, 5, 4};
		
		printArr(arr); // 배열 arr 출력
		sortArr(arr); // 배열 arr 정렬(오름차순)
		printArr(arr);
		System.out.println("sum = " + sum(arr)); // 배열 arr의 모든 요소들의 합
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
