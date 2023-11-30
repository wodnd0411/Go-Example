package ch07;

public class Point {

	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")"; // x와 y의 값을 문자열로 변환
	}
	
}
