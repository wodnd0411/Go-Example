package ch06;

public class MyPoint {
	
	// �ν��Ͻ� ����
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �ν��Ͻ� ���� ��� -> �ν��Ͻ� �޼��� ���
	double getDistance(int x, int y) {
		double result = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));
		
		return result;
	}

}
