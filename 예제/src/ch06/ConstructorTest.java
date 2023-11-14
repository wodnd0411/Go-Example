package ch06;

class Data1 { // 컴파일러가 자동으로 기본 생성자 추가해줌
	
	int value;
	
//	Data1() {
//		
//	}
	
}

class Data2 { // 생성자가 있기 때문에 컴파일러가 기본 생성자 자동 추가 X
	
	int value;
	
//	Data2() {
//		
//	}
	
	Data2(int v) {
		value = v;
	}
	
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); // Data2() 기본 생성자가 없다
	}

}
