package ch05;

// �迭 arr�� ��� ���� ���հ� ���
public class Exercise5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		avg = (float)sum / (arr.length * arr[0].length);
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
