package ch05;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 배열 numArr에 값을 0 ~ 9로 저장
		}
		System.out.println(Arrays.toString(numArr));
		
		// 배열 numArr의 요소에 기존 값들을 랜덤으로 저장
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random() * numArr.length); // 0 <= n < 10 랜덤 값 저장
			
			int tmp = numArr[i]; // 임시 저장 공간 tmp에 배열 numArr 저장(중복 x)
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
	}

}
