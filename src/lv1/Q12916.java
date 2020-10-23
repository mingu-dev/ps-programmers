package lv1;

public class Q12916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean solution(String s) {
		boolean answer = true;

		// 1. s를 char 배열로 바꾼다.
		char[] input = s.toCharArray();

		// 2. 배열의 각 요소를 돌며 p이면 pCnt, y이면 yCnt를 늘린다. (대소문자 구별 X)
		int pCnt = 0;
		int yCnt = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 'p' || input[i] == 'P') {
				pCnt++;
				continue;
			}

			if (input[i] == 'y' || input[i] == 'Y') yCnt++;
		}

		// 3. 카운터가 서로 같으면 true, 아니면 false를 리턴한다.
		if (pCnt != yCnt) answer = false;

		return answer;
	}

}
