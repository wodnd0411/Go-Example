package ch06;

public class Car {
	
	String color; // ����
	String gearType; // ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door; // ���� ����
	
	// �⺻ ������
	Car() {
		
	}
	
	// �Ű����� �ִ� ������
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}

}
