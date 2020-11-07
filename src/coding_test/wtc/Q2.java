package coding_test.wtc;

public class Q2 {

	public static void main(String[] args) {
		long[] arr = solution("1234", "+");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
    public static long[] solution(String s, String op) {
    	int length = s.length();
        long[] answer = new long[length-1];
        for (int i = 0; i < length - 1; i++) {
        	int left = Integer.parseInt(s.substring(0, i+1));
        	int right = Integer.parseInt(s.substring(i+1));
        	switch (op) {
        	case "+":
            	answer[i] = left + right;
            	continue;
        	case "-":
        		answer[i] = left - right;
        		continue;
        	case "*":
        		answer[i] = left * right;
        		continue;
        	}
        }
        return answer;
    }
}
