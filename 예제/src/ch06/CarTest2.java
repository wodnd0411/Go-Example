package ch06;

public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color = " + c1.color);
		System.out.println("c1의 gearType = " + c1.gearType);
		System.out.println("c1의 door = " + c1.door);
		
		System.out.println("c2의 color = " + c2.color);
		System.out.println("c2의 gearType = " + c2.gearType);
		System.out.println("c2의 door = " + c2.door);
	}

}
