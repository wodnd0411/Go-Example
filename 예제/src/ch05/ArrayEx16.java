package ch05;

public class ArrayEx16 {

	// Ŀ�ǵ� ������ ���� �Է¹ޱ�
	// Ŭ�����̸� args[0] args[1] ...
	public static void main(String[] args) {
		System.out.println("�Ű������� ���� : " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
		}
	}

}
