package ch07;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car(); // Car�� ��ü ����
		Car car2 = null; // CarŸ���� �������� car2 ����
		FireEngine fe = null;
		
		car.drive(); // Car�� �ν��Ͻ� drive() ȣ��
		
		fe = (FireEngine)car; // �ڽ� Ÿ���� ���������� �θ� Ÿ���� �ν��Ͻ��� ����Ŵ -> ����
		fe.drive();
		
		car2 = (Car)fe;
		car2.drive();
	}

}
