package lv1;

import java.util.ArrayList;

public class Q12906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length-1; i++) {
			if (i == arr.length - 2) {
				if (arr[i] == arr[i+1]) {
					list.add(arr[i]);
					break;
				} else {
					list.add(arr[i]);
					list.add(arr[i+1]);
					break;
				}
			}
			if (arr[i] == arr[i+1])
				continue;
			list.add(arr[i]);
		}
		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++)
			answer[i] = (int)list.get(i);
		// set.add()의 매개변수로 배열의 이름을 넣으면 배열의 모든 값이 한 번에 set에 추가되는가? (X) for문으로 일일이 다 추가해야한다.
		// iterator로 배열에 값을 넣고 배열의 크기가 실제 데이터 개수와 다르면 나머지 요소에 0이 들어가 있기 때문에 정답과 다르게 판정된다.
		return answer;
	}
}
