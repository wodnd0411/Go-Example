package ch06;

import java.util.Arrays;

public class StaticBlockTest {
	
	static int[] arr = new int[10];
	
	// Ŭ���� �ʱ�ȭ ��(Ŭ���� ������ ������ �ʱ�ȭ)
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
	}

}
