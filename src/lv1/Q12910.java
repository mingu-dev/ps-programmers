package lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Q12910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		
		ArrayList list = new ArrayList();
		
		// 배열의 각 요소를 divisor로 나눴을 때 떨어지면 answer 배열에 담는다.
		
		// 배열에 divisor로 나누어 떨어지는 요소의 개수가 몇 개인지를 카운트한다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0)
				list.add(arr[i]);
		}
		
		// answer 배열에 담긴게 아무 것도 없다면 -1을 담는다.
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		// list를 오름차순으로 정렬한다.
		Collections.sort(list);
		
		answer = new int[list.size()]; // 나누어 떨어지는 요소의 개수를 answer 배열의 크기로 삼는다.
		
		for (int i = 0; i < answer.length; i++)
			answer[i] = (int)list.get(i);
		
		return answer;
	}
}
