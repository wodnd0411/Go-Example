package ch06;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		// static 메서드는 객체 생성 없이 호출
		Data d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data copy(Data d) { // 참조형 반환타입, 참조형 매개변수
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp; // 객체 주소 반환
	}

}
