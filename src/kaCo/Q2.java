package kaCo;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int solution(int[][] needs, int r) {
        int answer = 0;
        int[] tmpArr = new int[needs.length];
        for (int i = 0; i < needs.length; i++) {
        	int k = 0;
        	for (int j = 0; j < needs[i].length; j++) {
        		if (needs[i][j] == 1) {
        			tmpArr[k]++;
        		}
        		k++;
        	}
        }
        Arrays.sort(tmpArr);
        answer = tmpArr[tmpArr.length-r];
        return answer;
    }
}
