package ch06;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] arr = {10}; // ���̰� 1�� �迭 arr�� 10���� �ʱ�ȭ
		System.out.println("main() : x = " + arr[0]);
		
		change(arr); // �迭 arr�� �ּҰ� ��� �������� arr
		
		System.out.println("After change(x)");
		System.out.println("main() : x = " + arr[0]);
	}
	
	static void change(int[] arr) {
		arr[0] = 1000;
		
		System.out.println("change() : x = " + arr[0]);
	}

}
