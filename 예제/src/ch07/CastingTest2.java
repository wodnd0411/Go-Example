package ch07;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car(); // Car의 객체 생성
		Car car2 = null; // Car타입의 참조변수 car2 선언
		FireEngine fe = null;
		
		car.drive(); // Car의 인스턴스 drive() 호출
		
		fe = (FireEngine)car; // 자식 타입의 참조변수가 부모 타입의 인스턴스를 가리킴 -> 에러
		fe.drive();
		
		car2 = (Car)fe;
		car2.drive();
	}

}
