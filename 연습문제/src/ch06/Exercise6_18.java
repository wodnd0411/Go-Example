package ch06;

public class Exercise6_18 {

	public static void main(String[] args) {
		
	}

}

class MemberCall {
	
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // Ŭ���� ����
	
	int iv2 = cv; // �ν��Ͻ� ������ Ŭ���� ���� ���� ����
//	static cv2 = iv; // �ν��Ͻ� ���� ���� cv2�� ���� �ε�� �� �־ ����
	
	static void staticMethod1() {
		System.out.println(cv); // cv�� Ŭ���� ����
//		System.out.println(iv); // iv�� �ν��Ͻ� ���� -> �ν��Ͻ� ���� �� ��� ����
	}
	
	void instanceMethod1() {
		System.out.println(cv); // �ν��Ͻ� �޼��忡�� Ŭ���� ���� ��� ����
		System.out.println(iv); // �ν��Ͻ� ����
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // Ŭ���� �޼��忡�� �ν��Ͻ� �޼��� ��� �Ұ�
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
}