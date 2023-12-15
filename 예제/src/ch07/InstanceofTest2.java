package ch07;

public class InstanceofTest2 {

	public static void main(String[] args) {
		Car c = new Car();
		
		if(c instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if(c instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if(c instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(c.getClass().getName()); // 패키지이름.클래스이름
	}

}
