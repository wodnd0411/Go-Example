package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		// java.util.Date today = new java.util.Date();
		// import���� �տ� ��Ű�� java.util�� ���� ����
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM /dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("���� ��¥�� " + date.format(today));
		System.out.println("���� �ð��� " + time.format(today));
	}

}
