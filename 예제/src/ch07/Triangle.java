package ch07;

public class Triangle extends Shape {
	
	Point[] p = new Point[3]; // 삼각형은 좌표 3개 필요

	Triangle(Point[] p) {
		// super(); // Circle 클래스와 동일
		this.p = p;
	}

	// 부모 클래스 Shape의 draw() 메서드 오버라이딩
	void draw() {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]%n", 
				p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}

}
