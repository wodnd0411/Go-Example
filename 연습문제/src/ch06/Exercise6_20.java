package ch06;

import java.util.Arrays;

public class Exercise6_20 {
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
	
	// �ε��� 0������ ���� �ε����� �� ����
//	static int[] shuffle(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			int index = (int)(Math.random() * 9); // 0 ~ 9
//			int tmp = 0;
//			
//			tmp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = tmp;
//			
//		}
//		
//		return arr;
//	}
	
	// ���� �ε����� ���� �ε����� �� ����
	static int[] shuffle(int[] arr) {
		// �Ű� ���� ��ȿ�� �˻�
		if(arr == null || arr.length == 0) {
			System.out.println("�迭�� �ٽ� ����ÿ�.");
			
			return arr;
		}
		
		for(int i = 0; i < arr.length; i++) {
			int index1 = (int)(Math.random() * arr.length);
			int index2 = (int)(Math.random() * arr.length);
			
			int tmp = 0;
			
			tmp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = tmp;
		}
		
		return arr;
	}

}
