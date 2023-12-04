package ch07;

public class Point {

	int x = 10;
	int y = 20;
	
	Point(int x, int y) {
		// super(); // 부모 클래스 Object의 생성자 Object()를 호출
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")"; // x와 y의 값을 문자열로 변환
	}
	
	String getLocation() {
		return "x : " + x + "y : " + y;
	}
	
}
