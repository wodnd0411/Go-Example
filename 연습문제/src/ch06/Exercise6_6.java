package ch06;

// �� �� ������ �Ÿ� ���(static �޼���)
public class Exercise6_6 {

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
	// �ν��Ͻ� ���� ��� X -> static �޼��� ���
	static double getDistance(int x1, int y1, int x2, int y2) {
		double result = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		return result;
	}

}
