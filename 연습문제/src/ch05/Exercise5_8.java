package ch05;

// �迭 answer�� ����� ������ ������ ��� ������ŭ �����
public class Exercise5_8 {

	public static void main(String[] args) {
		// 1 ***
		// 2 **
		// 3 **
		// 4 ****
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] count = new int[4]; // ���ڰ� �� �� ���Դ��� ī��Ʈ
		
		for(int i = 0; i < answer.length; i++) {
			count[answer[i] - 1]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(i + 1 + "�� " + count[i] + "��");
			
			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
