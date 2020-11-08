package coding_test.wtc;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int n, int[][] board) {
		int answer = 0;
		int target = 1;
		int cur_row = 0;
		int cur_col = 0;

		while (target <= n * n) {
			loop: 
            for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// 숫자(타겟) 찾은 경우
					if (board[i][j] == target) {
                        int dist_x = 0;
                        int dist_y = 0;
                        // 행 좌표 이동거리 계산
                        if (cur_row >= i) {
                            dist_x = Math.min(Math.abs(i - cur_row), Math.abs(i - (-1)));                            
                        } else {
                            dist_x = Math.min(Math.abs(i - cur_row), Math.abs(i - n));
                        }
                        // 열 좌표 이동거리 계산
                        if (cur_col >= j) {
						    dist_y = Math.min(Math.abs(j - cur_col), Math.abs(j - (-1)));                            
                        } else {
						    dist_y = Math.min(Math.abs(j - cur_col), Math.abs(j - n));                            
                        }
						answer += dist_x + dist_y + 1; // 총 이동거리 계산
                        // 현재 좌표 및 다음 타겟 번호 재설정
						cur_row = i;
						cur_col = j;
                        System.out.println("dist_x : " + dist_x + ", dist_y : " + dist_y);
                        System.out.println("cur_row : " + cur_row + ", cur_col : " + cur_col);
                        System.out.println("answer : " + answer);
						target++;
						break loop;
					}
				}
			}
		}
		return answer;
	}
}
