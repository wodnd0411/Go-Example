package ch07;

public class Point {

	int x = 10;
	int y = 20;
	
	Point(int x, int y) {
		// super(); // �θ� Ŭ���� Object�� ������ Object()�� ȣ��
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")"; // x�� y�� ���� ���ڿ��� ��ȯ
	}
	
	String getLocation() {
		return "x : " + x + "y : " + y;
	}
	
}
