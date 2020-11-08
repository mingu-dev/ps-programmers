package coding_test.wtc;

public class Q5 {

	public static void main(String[] args) {
		solution("1100", "0010", "1001", "110011011001100110010010111100111001110000000010");
	}

    public static String solution(String penter, String pexit, String pescape, String data) {
        String answer = "";
        // data를 penter 길이 단위로 쪼개서, penter, pexit, pescape랑 같은 부분이 있는지 체크한다.
        int length = penter.length();
        
        answer += penter; // 1. 제일 먼저 penter를 앞에 붙여준다.
        // 2. data를 잘라 중복될 시 pescape를 붙인 후에 추가한다.
        for (int i = 0; i + length <= data.length(); i += length) {
        	String slice = data.substring(i, i + length);
        	if (slice.equals(penter) || slice.equals(pexit) || slice.equals(pescape)) {
        		answer += pescape + slice;
        		continue;
        	}
        	answer += slice;
        }
        answer += pexit; // 3. 마지막으로 맨 뒤에 pexit을 붙인다.
        return answer;
    }
}
