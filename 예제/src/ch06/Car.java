package ch06;

public class Car {
	
	String color; // ����
	String gearType; // ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door; // ���� ����
	
	// �⺻ ������
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	// �ν��Ͻ� ���縦 ���� ������
	Car(Car c) {
		this(c.color, c.gearType, c.door);
	}
	
	// �Ű����� �ִ� ������
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
