package ch07;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null; // Car타입의 참조변수 car 선언
		FireEngine fe = new FireEngine(); // FireEngine의 객체 생성
		FireEngine fe2 = null;
		
		fe.water();
		
		car = (Car)fe; // fe에 담긴 객체 주소를 car에 저장
//		car.water(); // Car타입이므로 water() 멤버 호출 불가
		
		fe2 = (FireEngine)car; // car에 담긴 객체 주소를 fe2에 저장
		fe2.water();
	}

}
