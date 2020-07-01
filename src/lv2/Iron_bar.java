package lv2;

public class Iron_bar {

	public static int solution(String arrangement) {
		
        int answer = 0;
        int barCnt = 0;
        
        char[] arrChar = arrangement.toCharArray();
        
        for (int i = 0; i < arrChar.length; i++) {
        	
        	if (arrChar[i] == '(') {
        		barCnt++;
        	} else if (arrChar[i] == ')' && arrChar[i-1] == '(' && i != 0) {
        		barCnt--;
        		answer += barCnt;
        	} else if (arrChar[i] == ')' && arrChar[i-1] == ')' && i != 0) {
        		barCnt--;
        		answer++;
        	}
//        	System.out.println("i : " + i + " barCnt : " + barCnt + " answer : " + answer);
        }
        return answer;
    }
}
