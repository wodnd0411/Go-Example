package ch07;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null; // CarŸ���� �������� car ����
		FireEngine fe = new FireEngine(); // FireEngine�� ��ü ����
		FireEngine fe2 = null;
		
		fe.water();
		
		car = (Car)fe; // fe�� ��� ��ü �ּҸ� car�� ����
//		car.water(); // CarŸ���̹Ƿ� water() ��� ȣ�� �Ұ�
		
		fe2 = (FireEngine)car; // car�� ��� ��ü �ּҸ� fe2�� ����
		fe2.water();
	}

}
