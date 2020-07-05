package lv1;

public class Q12926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(String s, int n) {
		String answer = "";
		
		// 입력받은 문자열을 char 배열로 바꾼다.
		char[] tmp = s.toCharArray();
		// 각 문자를 아스키코드상에서 n만큼 거리를 늘린 후, 그 값을 다시 char 배열에 넣는다.
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] == ' ') { // 공백 처리
				answer += tmp[i];
			} else if (65 <= (int)tmp[i] && (int)tmp[i] <= 90) { // 대문자
				if ((int)tmp[i] + n > 90) { // n만큼 길이를 늘인게 Z를 넘어설 경우
					int newAdd = ((int)tmp[i] + n) - 90;
					answer += (char)(((int)'A' - 1) + newAdd);
				} else // Z를 넘어서지 않을 경우
					answer += (char)((int)tmp[i] + n);
			} else { // 소문자
				// 원래 문자 + n이 z보다 크면 다시 a로 돌아가서 n을 더해야 한다.
				// (원래 문자 + n) - 122의 값을 소문자 a의 아스키코드 값(97)에 더해준다.
				// 그 더해준 값이 출력될 문자이다.
				// 그렇게 더한 값은 122보다는 클 수 없다 (n <= 25)
				if ((int)tmp[i] + n > 122) { // n만큼 길이를 늘인게 Z를 넘어설 경우
					int newAdd = ((int)tmp[i] + n) - 122;
					answer += (char)(((int)'a' - 1) + newAdd);
				} else // Z를 넘어서지 않을 경우
					answer += (char)((int)tmp[i] + n);
			}
		}
		return answer;
	}
}
