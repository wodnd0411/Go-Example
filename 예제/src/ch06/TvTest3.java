package ch06;

public class TvTest3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		// Tv클래스의 참조변수 t1이 가지고 있는 주소를 t2에 저장
		// t1과 t2는 같은 객체를 가리킨다
		t2 = t1;
		
		t1.channel = 7;
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}
