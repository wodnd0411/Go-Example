package ch05;

public class ArrayEx17 {
	// 커맨드 라인을 통한 사칙연산
	public static void main(String[] args) {
		// 사칙연산을 위한 문장이 완성이 안되었을 때
		if(args.length != 3) {
			System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]); // 피연산자 1
		char op = args[1].charAt(0); // 연산자
		int num2 = Integer.parseInt(args[2]); // 피연산자 2
		int result = 0;
		
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default :
				System.out.println("지원되지 않는 연산자입니다.");
		}

		System.out.println("결과 : " + result);
	}

}
