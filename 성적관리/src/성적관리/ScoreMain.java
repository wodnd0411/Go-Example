package ��������;

public class ScoreMain {

	public static void main(String[] args) {
		switch(showMenu()) {
			case 1:
				inputScore(); // �����͸� �Է¹޴� �޼���
				break;
			case 2:
				changeScore(); // �����͸� �����ϴ� �޼���
				break;
			case 3:
				deleteScore(); // �����͸� �����ϴ� �޼���
				break;
			case 4:
				searchScore(); // �����͸� �˻��ϴ� �޼���
				break;
			default:
				showScoreList(); // �������� ����� �����ִ� �޼���
		}
	}

}
