package lv1;

import java.util.Arrays;
import java.util.Comparator;

public class Q12917 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solution(String s) {
		String answer = "";
		
		// comparator를 통해 정렬 기준을 1. 내림차순 2. 대문자 -> 소문자로 만들기
		
		// 1. 주어진 문자열을 String배열로 만들기. (char 배열은 Arrays.sort()의 매개변수가 될 수 없다.)
		char[] tmp = s.toCharArray(); // 1_1. 먼저 char배열로 만듬.
		String[] a = new String[tmp.length];
		for (int i = 0; i < tmp.length; i++) // 1_2. String으로 형변환해서 String 배열에 담는다. 
			a[i] = tmp[i] + "";
		
		// 2. char 배열을 정렬기준에 맞추어 정렬하기.
		Arrays.sort(a, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		// 3. 다시 char 배열을 합쳐서 문자열로 만들기.
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++)
			sb.append(a[i]);
		
		answer = sb.toString();
		return answer;
	}
}
