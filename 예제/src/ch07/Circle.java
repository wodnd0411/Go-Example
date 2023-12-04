package ch07;

public class Circle extends Shape {
	
	Point center; // ���� ���� ��ǥ
	int r; // ������
	
	Circle() {
		this(new Point(0, 0), 0);
	}
	
	Circle(Point center, int r) {
		// super(); // �θ� Ŭ���� Shape�� ������ �ڵ� ȣ��
		this.center = center;
		this.r = r;
	}
	
	// �θ� Ŭ���� Shape�� draw() �޼��� �������̵�
	void draw() {
		System.out.printf("[center = (%d, %d), r = %d, color = %s]%n", 
				center.x, center.y, r, color);
	}

}
