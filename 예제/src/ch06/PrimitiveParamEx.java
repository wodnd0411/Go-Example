package ch06;

// �⺻�� �Ű�����
public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		// ���� Ŭ���� ���� �ִ� static�޼��带 ȣ���ϱ� ������ Ŭ�����̸�.�޼����̸�() ���ص� �� 
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	// static�� ����� change �޼���� �ν��Ͻ� �޼���
	// �ν��Ͻ� �޼���� static �޼��忡�� ��� �Ұ�
	// static �޼��尡 ȣ��� �� �ν��Ͻ��� ���� �ȵǾ� ������ change �޼��带 ����� �� ���� 
	static void change(int x) { // �⺻�� �Ű����� -> �б⸸ ����
		x = 1000;
		
		System.out.println("change() : x = " + x);
	}

}
