package ch06;

// 참조형 매개변수
public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d); // 참조변수로 입력(Data 객체의 주소가 저장된 참조변수)
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) { // 참조형 매개변수 -> 읽기와 쓰기 가능
		d.x = 1000;
		
		System.out.println("change() : x = " + d.x);
	}

}
