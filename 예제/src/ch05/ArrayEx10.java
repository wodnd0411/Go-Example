package ch05;

import java.util.Arrays;

public class ArrayEx10 {

	// 버블정렬을 이용한 크기순으로 정렬
	public static void main(String[] args) {
		int[] arr = new int[10];
		int tmp = 0; // 임시로 저장 할 변수
		
		// 0 ~ 9 숫자들을 랜덤으로 배열 arr에 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		
		// 배열 요소들을 비교
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				// arr[j]와 바로 옆의 요소 arr[j + 1]을 비교
				if(arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		// 버블정렬 후 배열 arr 출력
		System.out.println(Arrays.toString(arr));
	}

}
