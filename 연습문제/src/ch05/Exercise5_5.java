package ch05;

// 1 ~ 9������ �ߺ����� �ʴ� ���ڷ� 3�ڸ� ���� �����
public class Exercise5_5 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int index = (int)(Math.random() * arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i]);
		}
	}

}
