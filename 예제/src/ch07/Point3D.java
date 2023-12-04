package ch07;

public class Point3D extends Point {
	
	int z = 30;
	
	Point3D() {
		this(100, 200, 300);
	}
	
	Point3D(int x, int y, int z) {
		super(x, y); // 부모 클래스의 생성자 Point(int x, int y) 호출
		this.z = z;
	}
	
	// 부모 클래스 Point의 getLocation() 메서드 오버라이딩
	String getLocation() {
		return super.getLocation() + "z : " + z;
	}
	
}
