package ch03;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = i++; // i는 j가 i의 5를 참조 후 i++
		System.out.println("j = i++; 실행 후, i= " + i + ", j = " + j); // i = 6, j = 5
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i; 실행 후, i= " + i + ", j = " + j); // i = 6, j = 6
	}

}
