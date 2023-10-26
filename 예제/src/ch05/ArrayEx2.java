package ch05;

import java.util.*;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] arr1 = new int[10]; // 길이가 10인 배열 arr1
		int[] arr2 = new int[10];
//		int[] arr3 = new int[] {100, 95, 90, 80, 70, 60};
		int[] arr3 = {100, 95, 90, 80, 70, 60};
		
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1; // arr1[0] = 1, arr1[1] = 2 등 저장
		}
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 10) + 1; // 1 ~ 10까지의 랜덤 수 배열 arr2에 저장
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(arr3);
		System.out.println(chArr);
	}

}
