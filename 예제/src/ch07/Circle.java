package ch07;

public class Circle extends Shape {
	
	Point center; // 원의 원점 좌표
	int r; // 반지름
	
	Circle() {
		this(new Point(0, 0), 0);
	}
	
	Circle(Point center, int r) {
		// super(); // 부모 클래스 Shape의 생성자 자동 호출
		this.center = center;
		this.r = r;
	}
	
	// 부모 클래스 Shape의 draw() 메서드 오버라이딩
	void draw() {
		System.out.printf("[center = (%d, %d), r = %d, color = %s]%n", 
				center.x, center.y, r, color);
	}

}
