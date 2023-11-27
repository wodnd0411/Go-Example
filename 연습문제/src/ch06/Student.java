package ch06;

// Exercise6_3
public class Student {

	String name; // �л� �̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ���� ����
	int eng; // ���� ����
	int math; // ���� ����
	
	Student() {
		this("", 0, 0, 0, 0, 0);
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// ����, ����, ���� ������ ���� ���ؼ� ��ȯ
	int getTotal() { return kor + eng + math; }
	
	// ��� ���ϱ�
	// �Ҽ��� ��°�ڸ����� �ݿø�
	float getAverage() {
		float avg = (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		
		return avg;
	}
	
	String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng
				 + ", " + math + ", " + getTotal() + ", " + getAverage();
	}
	
}
