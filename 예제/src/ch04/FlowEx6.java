package ch04;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = 0;
		int com = (int)(Math.random() * 3); // 0, 1, 2
		
		System.out.print("가위(0), 바위(1), 보(2) 중 하나를 입력하시오 : ");
		user = scanner.nextInt();
		
		System.out.println("당신은 " + user + "입니다");
		System.out.println("컴퓨터는 " + com + "입니다");
		
		switch(user - com) {
			case -2:
			case 1:
				System.out.println("당신이 이겼습니다.");
				break;
			case -1:
			case 2:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
		}
	}

}
