package lv1;

public class Q12918 {

	public static void main(String[] args) {

	}

	public boolean solution(String s) {
		boolean answer = true;
		int conditionCnt = 0;
		int unicodeCnt = 0;

		// 1. s를 char배열로 바꾼다.
		char[] tmp = s.toCharArray();
		// 2. char배열의 길이가 4 혹은 6인지 확인한다.
		if (tmp.length == 4 || tmp.length == 6) {
			conditionCnt++;
		}
		// 3. 0~9까지 유니코드에 해당하는지 확인하기.
		for (int i = 0; i < tmp.length; i++) {
			if (!(48 <= tmp[i] && tmp[i] <= 57)) {
				break;
			} else {
				unicodeCnt++;
			}
		}

		// 3_2. 유니코드 조건 카운터가 문자열 길이랑 같다면 조건 카운터에 1을 추가한다.
		if (unicodeCnt == tmp.length)
			conditionCnt++;

		// 4. 조건 카운터가 2이면 true, 아니면 false 출력.
		if (conditionCnt != 2) answer = false;

		return answer;
	}
}