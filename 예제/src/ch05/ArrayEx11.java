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
		
		// arr[i]의 값은 counter의 인덱스 중 하나와 같다(0 ~ 9)
		// 같은 게 나올 때마다 1씩 증가
		for(int i = 0; i < arr.length; i++) {
			counter[arr[i]]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}

}
