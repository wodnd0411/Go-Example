package ch07;

import java.util.Vector;

public class Buyer {
	
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 점수
	
	Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열에 사용될 index
	
//	Vector item = new Vector(); // 구입한 제품을 저장하기 위한 Vector 객체
	
	// 제품 구매
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 제품을 item에 저장
		
//		item.add(p); // 구입한 제품을 Vector에 저장
		
		System.out.println(p + "을/를 구매하셨습니다."); // toString() 때문에 p만 해도 나옴
	}
	
	// 구입한 제품 환불
//	void refund(Product p) {
//		// 구입한 제품을 Vector에서 제거
//		if(item.remove(p)) {
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//			
//			System.out.println("반품을 하셨습니다.");
//		}
//		else {
//			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
//		}
//	}
	
	// 구매한 물품에 대한 정보를 요약해서 보여줌
	void summary() {
		int sum = 0; // 구입한 물품  합계 금액
		String itemList = ""; // 구입한 물품 목록
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				break;
			}
			
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "입니다.");
		System.out.println("구입하신 물품 리스트는 " + itemList + "입니다.");
	}
	
//	void summary() {
//		int sum = 0;
//		String itemList = "";
//		
//		// Vector가 비어있는지 확인
//		if(item.isEmpty()) {
//			System.out.println("구입하신 제품이 없습니다.");
//			
//			return;
//		}
//		
//		for(int i = 0; i < item.size(); i++) {
//			Product p = (Product)item.get(i);
//			
//			sum += p.price;
//			itemList += (i == 0) ? "" + p : ", " + p;
//			
//			System.out.println("구입하신 물품의 총 금액은 " + sum + "입니다.");
//			System.out.println("구입하신 물품 리스트는 " + itemList + "입니다.");
//		}
//	}

}
