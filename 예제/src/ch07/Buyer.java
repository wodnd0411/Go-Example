package ch07;

import java.util.Vector;

public class Buyer {
	
	int money = 1000; // ���� �ݾ�
	int bonusPoint = 0; // ���ʽ� ����
	
	Product[] item = new Product[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product �迭�� ���� index
	
//	Vector item = new Vector(); // ������ ��ǰ�� �����ϱ� ���� Vector ��ü
	
	// ��ǰ ����
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // ��ǰ�� item�� ����
		
//		item.add(p); // ������ ��ǰ�� Vector�� ����
		
		System.out.println(p + "��/�� �����ϼ̽��ϴ�."); // toString() ������ p�� �ص� ����
	}
	
	// ������ ��ǰ ȯ��
//	void refund(Product p) {
//		// ������ ��ǰ�� Vector���� ����
//		if(item.remove(p)) {
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//			
//			System.out.println("��ǰ�� �ϼ̽��ϴ�.");
//		}
//		else {
//			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
//		}
//	}
	
	// ������ ��ǰ�� ���� ������ ����ؼ� ������
	void summary() {
		int sum = 0; // ������ ��ǰ  �հ� �ݾ�
		String itemList = ""; // ������ ��ǰ ���
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				break;
			}
			
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ ����Ʈ�� " + itemList + "�Դϴ�.");
	}
	
//	void summary() {
//		int sum = 0;
//		String itemList = "";
//		
//		// Vector�� ����ִ��� Ȯ��
//		if(item.isEmpty()) {
//			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
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
//			System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�Դϴ�.");
//			System.out.println("�����Ͻ� ��ǰ ����Ʈ�� " + itemList + "�Դϴ�.");
//		}
//	}

}
