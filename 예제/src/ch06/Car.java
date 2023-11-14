package ch06;

public class Car {
	
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수
	
	// 기본 생성자
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	// 인스턴스 복사를 위한 생성자
	Car(Car c) {
		this(c.color, c.gearType, c.door);
	}
	
	// 매개변수 있는 생성자
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
