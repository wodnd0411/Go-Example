package ch05;

// �迭 ���� ���1
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// �迭 arr�� �� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("[�迭 arr���� ���� ��]");
		System.out.println("arr.length : " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2]; // �迭 arr�� 2�� ������ �迭 tmp ����
		
		// �迭 tmp�� �迭 arr�� ���� ����
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; // �迭 tmp�� �ּҸ� �������� arr�� ����
		
		System.out.println("[���� ��]");
		System.out.println("arr.length : " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}
	}

}
