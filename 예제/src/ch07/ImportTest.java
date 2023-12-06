package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		// java.util.Date today = new java.util.Date();
		// import문은 앞에 패키지 java.util을 생략 가능
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM /dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("오늘 시간은 " + time.format(today));
	}

}
