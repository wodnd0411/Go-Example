package ch05;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int index = 0; // 랜덤 인덱스를 담을 변수
		
		// 1 ~ 10을 랜덤으로 값 저장
		for(int i = 0; i < num.length; i++) {
			index = (int)(Math.random() * num.length); // 0 ~ 9 랜덤
			
			num[i] = num[index]; // num[0]부터 차례대로 기존의 값에서 랜덤으로 저장(중복 o or x)
		}
		
		System.out.println(Arrays.toString(num));
	}
}
