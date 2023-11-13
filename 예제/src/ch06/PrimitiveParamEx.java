package ch06;

// 기본형 매개변수
public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		// 같은 클래스 내에 있는 static메서드를 호출하기 때문에 클래스이름.메서드이름() 안해도 됨 
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	// static을 지우면 change 메서드는 인스턴스 메서드
	// 인스턴스 메서드는 static 메서드에서 사용 불가
	// static 메서드가 호출될 때 인스턴스가 생성 안되어 있으면 change 메서드를 사용할 수 없다 
	static void change(int x) { // 기본형 매개변수 -> 읽기만 가능
		x = 1000;
		
		System.out.println("change() : x = " + x);
	}

}
