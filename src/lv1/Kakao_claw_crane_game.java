package lv1;

import java.util.ArrayList;

public class Kakao_claw_crane_game {
	
    public static int solution(int[][] board, int[] moves) {
    	
    	// 1. moves에 해당하는 번호를 board에서 찾아서 꺼냄 -> 0이 아닌 가장 높은 위치(낮은 인덱스)에 있는 숫자를 꺼내게 됨
    	// 2. 배열 만들어서 board에 있던걸 담음
    	// 3. board에서는 0으로 바꿔주기
    	// 4. 1~3 반복
    	// 4-1. 만든 배열에 앞 숫자랑 같은거 생기면, 둘 다 삭제하게 answer++;
    	
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<Integer>();
        int basketIdx = -1;
        
        for (int i : moves) {
        	for (int j = 0; j < board.length; j++) { // 일단 정사각배열로 가정
        		if (board[j][i-1] != 0) {
        			basket.add(board[j][i-1]);
        			basketIdx++;
        			board[j][i-1] = 0;
        			
            		if (basketIdx > 0 && basket.get(basketIdx-1) == basket.get(basketIdx)) {
            			basket.remove(basketIdx);
            			basket.remove(basketIdx-1);
            			basketIdx -= 2;
            			answer += 2;
            		}
            		break;
        		}
        	}
        }
        return answer;
    }
}
