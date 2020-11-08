package coding_test.wtc;

public class Q3 {

	public static void main(String[] args) {
		String[] expected = { "t", "t", "h", "h", "h" };
		String[] actual = { "h", "h", "t", "h", "t" };
		System.out.println(solution(1200, expected, actual));
	}
	
    public static int solution(int money, String[] expected, String[] actual) {
        int answer = money;
        int bet = 100;
        
        for (int i = 0; i < expected.length; i++) {
        	System.out.println("answer : " + answer);
        	System.out.println("i : " + i);
        	if (expected[i].equals(actual[i])) {
        		answer += bet;
        		bet = 100;
        		continue;
        	}
        	System.out.println("bet : " + bet);
        	answer -= bet;
        	if (answer == 0) {
        		return answer;
        	}
        	if (answer >= bet * 2) {
            	bet *= 2;
            	System.out.println("after bet : " + bet);
            	continue;
        	}
        	bet = answer;
        	System.out.println("after bet : " + bet);
        }
        return answer;
    }

}
