package ch03;
import java.util.Scanner;

public class OperatorEx32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int absInput = 0;
		
		System.out.print("절댓값을 구할 정수를 입력하시오 : ");
		input = scanner.nextInt();
		
		absInput = (input >= 0) ? input : -input;
		System.out.printf("입력한 수의 절댓값은 %d입니다.%n", absInput);
	}

}
