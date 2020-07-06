package lv1;

public class Q12921 {
	
	public static void main(String[] args) {
		
	}

	public int solution(int n) {
		int answer = 0;
				
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			if (i == 2 || i == 3) {
				answer++;
				continue;
			}
			for (int j = 2; j*j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				answer++;
		}
		return answer;
	}
}
