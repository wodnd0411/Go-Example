package ch06;

import java.util.Arrays;

public class Exercise6_23 {

	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		
		System.out.println(Arrays.toString(data));
		System.out.println("�ִ� : " + max(data));
		System.out.println("�ִ� : " + max(null));
		System.out.println("�ִ� : " + max(new int[] {})); // ���̰� 0�� �迭
	}
	
	static int max(int[] arr) {
		int maxNum = 0;
		
		// �Ű� ������ ��ȿ�� �˻�
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		
		return maxNum;
	}

}
