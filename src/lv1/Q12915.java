package lv1;

import java.util.Arrays;

public class Q12915 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			char tmp = strings[i].charAt(n); // strings의 각 문자열 요소의 n번째 문자를 추출한다.
			strings[i] = tmp + strings[i]; // 추출한 n번째 문자를 문자열 맨 앞에 붙인다.
		}

		// strings 배열을 정렬한다. 문자열이므로 맨 앞의 소문자 기준 사전식으로 자동 정렬된다.
		Arrays.sort(strings);

		// 정렬된 문자열들의 맨 앞 문자를 제외한 값을 정답 배열에 넣는다.
		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].substring(1, strings[i].length());
		}
		return answer;
	}
}
