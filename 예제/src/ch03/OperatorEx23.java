package ch03;

public class OperatorEx23 {
	
	public static void main(String[] args) {
		String s1 = "테스트";
		String s2 = "테스트";
		String s3 = new String("테스트");
		String s4 = new String("테스트");
		
		System.out.println("테스트" == "테스트");
		System.out.println(s1 == "테스트");
		System.out.println(s2 == "테스트");
		System.out.println(s3 == "테스트");
		System.out.println(s4 == "테스트");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
	}
	
}
