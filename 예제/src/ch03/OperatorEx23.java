package ch03;

public class OperatorEx23 {
	
	public static void main(String[] args) {
		String s1 = "�׽�Ʈ";
		String s2 = "�׽�Ʈ";
		String s3 = new String("�׽�Ʈ");
		String s4 = new String("�׽�Ʈ");
		
		System.out.println("�׽�Ʈ" == "�׽�Ʈ");
		System.out.println(s1 == "�׽�Ʈ");
		System.out.println(s2 == "�׽�Ʈ");
		System.out.println(s3 == "�׽�Ʈ");
		System.out.println(s4 == "�׽�Ʈ");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
	}
	
}
