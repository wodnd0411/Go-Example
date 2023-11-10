package ch06;

public class CardTest {
	
	public static void main(String[] args) {
		// 클래스 변수는 클래스이름.클래스변수
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); // Card 클래스의 인스턴스 생성
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + " " + c1.number + "이며, 크기는" 
							+ "(" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.number + "이며, 크기는" 
							+ "(" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		// Card.width, Card.height와 같은 형태로 하는 것이 좋다
		c1.width = 50;
		c1.height = 80;
		
		// c1만 변경해도 width와 height는 클래스 변수이기 때문에 공통으로 바뀜
		System.out.println("c1은 " + c1.kind + " " + c1.number + "이며, 크기는" 
							+ "(" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.number + "이며, 크기는" 
							+ "(" + c2.width + ", " + c2.height + ")");
		
	}

}
