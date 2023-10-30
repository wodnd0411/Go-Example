package ch05;

public class ArrayEx17 {
	// Ŀ�ǵ� ������ ���� ��Ģ����
	public static void main(String[] args) {
		// ��Ģ������ ���� ������ �ϼ��� �ȵǾ��� ��
		if(args.length != 3) {
			System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]); // �ǿ����� 1
		char op = args[1].charAt(0); // ������
		int num2 = Integer.parseInt(args[2]); // �ǿ����� 2
		int result = 0;
		
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default :
				System.out.println("�������� �ʴ� �������Դϴ�.");
		}

		System.out.println("��� : " + result);
	}

}
