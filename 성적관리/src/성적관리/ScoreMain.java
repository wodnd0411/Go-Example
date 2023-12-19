package 성적관리;

public class ScoreMain {

	public static void main(String[] args) {
		switch(showMenu()) {
			case 1:
				inputScore(); // 데이터를 입력받는 메서드
				break;
			case 2:
				changeScore(); // 데이터를 변경하는 메서드
				break;
			case 3:
				deleteScore(); // 데이터를 삭제하는 메서드
				break;
			case 4:
				searchScore(); // 데이터를 검색하는 메서드
				break;
			default:
				showScoreList(); // 데이터의 목록을 보여주는 메서드
		}
	}

}
