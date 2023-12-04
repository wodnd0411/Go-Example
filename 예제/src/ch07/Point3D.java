package ch07;

public class Point3D extends Point {
	
	int z = 30;
	
	Point3D() {
		this(100, 200, 300);
	}
	
	Point3D(int x, int y, int z) {
		super(x, y); // �θ� Ŭ������ ������ Point(int x, int y) ȣ��
		this.z = z;
	}
	
	// �θ� Ŭ���� Point�� getLocation() �޼��� �������̵�
	String getLocation() {
		return super.getLocation() + "z : " + z;
	}
	
}
