package lv1;

public class Q12912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long solution(int a, int b) {
		long answer = 0;

		// a와 b의 대소관계를 판단한다.
		int max = Math.max(a, b);
		int min = 0;

		if (max == a) min = b;
		else min = a;

		// 작은 수부터 큰 수까지의 합계를 구한다.
		for (int i = min; i <= max; i++)
			answer += (long) i;

		return answer;
	}
}
