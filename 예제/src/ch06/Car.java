package ch06;

public class Car {
	
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수
	
	// 기본 생성자
	Car() {
		
	}
	
	// 매개변수 있는 생성자
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}

}
