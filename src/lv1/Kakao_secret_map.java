package lv1;

import java.util.ArrayList;
import java.util.List;

public class Kakao_secret_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] arr1BinStr = new String[n];
		String[] arr2BinStr = new String[n];
		char[][] arr1BinChar = new char[n][n];
		char[][] arr2BinChar = new char[n][n];
		char[][] tmpArr = new char[n][n];

		// 1. 각 배열들의 요소인 10진수를 2진수로 바꾼다.
		for (int i = 0; i < n; i++) {
			arr1BinStr[i] = Integer.toBinaryString(arr1[i]);
			arr2BinStr[i] = Integer.toBinaryString(arr2[i]);
		}

		// 2. 바뀌어진 2진수의 각 자릿수를 배열로 가지는 2차원 배열을 만든다.
		// 이진수 문자 배열의 길이가 n이 되지 않을 경우, n에서 배열의 길이를 뺀 값만큼 앞부분에 0을 추가해준다.
		for (int i = 0; i < n; i++) {
			List<Character> list1 = new ArrayList<>(); // 배열의 길이를 미리 정할 수 없으므로 ArrayList로 만듬.
			List<Character> list2 = new ArrayList<>();

			// 1번 배열
			char[] tmp1 = arr1BinStr[i].toCharArray();
			if (tmp1.length != n) {
				int tmp = n - tmp1.length;
				for (int j = 0; j < tmp; j++)
					list1.add('0');
			}

			for (int j = 0; j < tmp1.length; j++) {
				list1.add(tmp1[j]);
			}

			// 2번 배열
			char[] tmp2 = arr2BinStr[i].toCharArray();
			if (tmp2.length != n) {
				int tmp = n - tmp2.length;
				for (int j = 0; j < tmp; j++)
					list2.add('0');
			}

			for (int k = 0; k < tmp2.length; k++) {
				list2.add(tmp2[k]);
			}

			// list에 담긴 숫자들을 char 배열로 옮겨 담음
			for (int j = 0; j < n; j++) {
				arr1BinChar[i][j] = (char) list1.get(j);
				arr2BinChar[i][j] = (char) list2.get(j);
			}

			// 2진수로 변환 시에 주어진 n의 개수를 못 채울 경우, 빈 자리에는 0이 들어간다.
			// list에는 빈 공간에 0이 채워진 채로 2진수가 문자로 나뉘어서 들어가져 있다.
		}

		// 3. 2에서 만들어진 2차원 배열 2개를 가지고, 동일한 배열의 인덱스를 비교해서 새로운 2차원 배열을 만든다.
		// 3_1. 배열의 방법은 '둘 중 하나라도 1 이면 1 이고, 그 외의 경우는 모두 0이다.
		// 3_2. 1이 들어가야하는 경우에는 #을 넣고, 0이 들어가야 하는 경우에는 공백을 넣는다.
		for (int l = 0; l < n; l++) {
			for (int j = 0; j < n; j++) {
				if (arr1BinChar[l][j] == '1' || arr2BinChar[l][j] == '1') {
					tmpArr[l][j] = '#';
				} else
					tmpArr[l][j] = ' ';
			}
		}
		
		// 4. tmpArr의 각 문자들을 더해서 문자열로 만든 뒤에, answer에 넣는다.
		for (int l = 0; l < n; l++) {
			String tmp = "";
			for (int j = 0; j < n; j++) {
				tmp += tmpArr[l][j];
			}
			answer[l] = tmp;
		}
		return answer;
	}
}