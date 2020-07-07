package lv1;

public class Q12919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solution(String[] seoul) {
		String answer = "";
		// seoul의 모든 요소를 Kim과 동일한지 비교하면서 돈다.
		int idx = 0;
		
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				idx = i;
				break;
			}
		}
		answer = "김서방은 " + idx + "에 있다";
		return answer;
	}
}
