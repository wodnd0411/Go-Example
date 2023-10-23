package ch03;
import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("문자 하나를 입력하시오 : ");
		
		String input = scanner.nextLine();
		ch = input.charAt(0); // input값의 첫번째 글자를 저장
		
		if(ch >= '0' && ch <= '9') {
			System.out.printf("입력하신 문자는'%c'이고 숫자입니다.%n", ch);
		}
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.printf("입력하신 문자는'%c'이고 영문자입니다.%n", ch);
		}
	}

}
