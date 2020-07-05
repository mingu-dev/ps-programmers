package greedy;

public class Joystick {

	public static void main(String[] args) {
		// * A의 존재 => A이면 그냥 넘어가야한다.
		// 매 알파벳마다 최소 이동을 찾음 => 그리디
		// n : 13 -> 13
		// o : 14 -> 12
		// p : 15 -> 11
		// 일반화 : 26 - ( (int)c - 65 )
		// ex) AAAAB 이면? => 왼쪽 1번, 위로 1번
		// 
		
	}
	
    public static int solution(String name) {
    	int answer = 0;
    	char[] arr = name.toCharArray();
    	
    	for (char c : arr) {
    		if ((int)c == 65) { // A인 경우
    			answer++;
    		} else { // A가 아닌 경우
    			if ( ((int)c - 65) < 13) { // n 미만 알파벳인 경우
    				answer += ((int)c - 65);
    			} else { // n 이상 알파벳인 경우
    				answer += 26-((int)c-65);
    			};
    		}
    	}
        return answer;
    }
}
