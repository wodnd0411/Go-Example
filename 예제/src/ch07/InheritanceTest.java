package ch07;

public class InheritanceTest {

	public static void main(String[] args) {
		MyCircle c = new MyCircle();
		
		// ��� ����
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		
//		System.out.println("c.x = " + c.x);
//		System.out.println("c.y = " + c.y);
//		System.out.println("c.r = " + c.r);
		
		// ���� ����
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
	}

}

class MyPoint {
	int x;
	int y;
}
 
// ��� ����
//class MyCircle extends MyPoint {
//	int r;
//}

// ���� ����
class MyCircle {
	MyPoint p = new MyPoint();
	int r;
}