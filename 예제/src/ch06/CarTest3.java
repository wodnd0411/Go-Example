package ch06;

public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		
		System.out.println("c1의 color = " + c1.color);
		System.out.println("c1의 gearType = " + c1.gearType);
		System.out.println("c1의 door = " + c1.door);
		
		System.out.println("c2의 color = " + c2.color);
		System.out.println("c2의 gearType = " + c2.gearType);
		System.out.println("c2의 door = " + c2.door);
		
		System.out.println();
		c1.door = 10; // c1의 인스턴스 변수 door의 값을 변경
		System.out.println("c1.door = 10 수행 후");
		System.out.println();
		
		System.out.println("c1의 color = " + c1.color);
		System.out.println("c1의 gearType = " + c1.gearType);
		System.out.println("c1의 door = " + c1.door);
		
		System.out.println("c2의 color = " + c2.color);
		System.out.println("c2의 gearType = " + c2.gearType);
		System.out.println("c2의 door = " + c2.door);
	}

}
