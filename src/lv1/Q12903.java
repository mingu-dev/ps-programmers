package lv1;

public class Q12903 {

	public static void main(String[] args) {
		
	}
	
	public String solution(String s) {
		String answer = "";
		char[] sCharArr = s.toCharArray(); // 주어진 문자열을 char 배열로 바꾼다.
		char[] tmp = new char[sCharArr.length];
		int mid = sCharArr.length % 2;
		
		if (mid == 0) { // 문자열의 길이가 짝수일 때
			tmp[0] = sCharArr[sCharArr.length/2 - 1];
			tmp[1] = sCharArr[sCharArr.length/2];
			answer = "" + tmp[0] + tmp[1];
		} else { // 문자열의 길이가 홀수일 때
			tmp[0] = sCharArr[sCharArr.length/2];
			answer = "" + tmp[0];
		}
		return answer;
	}
}
