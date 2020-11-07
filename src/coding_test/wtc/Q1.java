package coding_test.wtc;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int solution(String[] grades, int[] weights, int threshold) {
        int answer = 0;
        for (int i = 0; i < grades.length; i++) {
        	answer += getScore(grades[i], weights[i]);
        }
        answer -= threshold;
        return answer;
    }
    
    public int getScore(String grade, int weight) {
        char[] tmp = grade.toCharArray();
        switch (tmp[0]) {
        	case 'A':
        		if (tmp[1] == '+') {
        			return 10 * weight;
        		}
        		return 9 * weight;
        	case 'B':
        		if (tmp[1] == '+') {
        			return 8 * weight;
        		}
        		return 7 * weight;
        	case 'C':
        		if (tmp[1] == '+') {
        			return 6 * weight;
        		}
        		return 5 * weight;
        	case 'D':
        		if (tmp[1] == '+') {
        			return 4 * weight;
        		}
        		return 3 * weight;
        	default:
        		return 0;
        }
    }
}
