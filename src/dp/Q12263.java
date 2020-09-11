package dp;

public class Q12263 {

	public static void main(String[] args) {

	}

	public static int solution(int[][] triangle) {
		int answer = 0;
		int n = triangle.length;
		int[][] accTriangle = new int[n][n];
		int max = 0;

		accTriangle[0][0] = triangle[0][0];
		for (int i = 1; i < n; i++) {
			accTriangle[i][0] = accTriangle[i - 1][0] + triangle[i][0];
			accTriangle[i][i] = accTriangle[i - 1][i - 1] + triangle[i][i];
		}

		for (int i = 2; i < n; i++) {
			for (int j = 1; j < i; j++) {
				accTriangle[i][j] = Math.max(accTriangle[i - 1][j - 1], accTriangle[i - 1][j]) + triangle[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			if (max < accTriangle[n - 1][i])
				max = accTriangle[n - 1][i];
		}
		answer = max;
		return answer;
	}
}
