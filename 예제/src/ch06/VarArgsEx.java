package ch06;

// 가변인자(varargs) -> 내부적으로 배열을 이용
// 가변인자가 선언된 메서드를 호출할 때 배열이 새로 생성됨
public class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		                // concatenate(delim, String... args)
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}
	
	// String... args값이 없어도 됨
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(int i = 0; i < args.length; i++) {
			result += args[i] + delim;
		}
		
		return result;
	}
	
//	static String concatenate(String... args) {
//		return concatenate("", args);
//	}

}
