package ch07;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12, 35, 30); // 12시 35분 30초
		System.out.println(t);
		
//		t.hour = 14; // private이라 접근 불가능
		t.setHour(t.getHour() + 1);
		System.out.println(t);
	}

}
