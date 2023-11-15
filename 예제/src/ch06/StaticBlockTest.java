package ch06;

import java.util.Arrays;

public class StaticBlockTest {
	
	static int[] arr = new int[10];
	
	// 클래스 초기화 블럭(클래스 변수의 복잡한 초기화)
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
	}

}
