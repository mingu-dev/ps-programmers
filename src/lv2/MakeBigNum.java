package lv2;

public class MakeBigNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static String solution(String number, int k) {
    	
        // 1. return 되는 숫자의 자릿수가 n자리라면, 뒷 부분에 n-1자리를 남기고 그 앞에서 최대를 구한다.
        // 2. 1 이후부터, 뒷 부분에 n-2자리를 남기고 그 앞에서 최대를 구한다.
        StringBuilder sb = new StringBuilder();
	    
		int cnt = number.length() - k;
        int left = 0;
        int right = number.length() - cnt;
        int max = -1;
        int idx = 0;
        
        while(cnt > 0) {
        	 max = -1;
             for(int j = left ; j <= right ; ++j){
                 int num = number.charAt(j) - '0';
                 if(num > max){
                     idx = j;
                     max = num;
                 }
             }
             sb.append(number.charAt(idx));
             left = idx + 1;
             right = number.length() - --cnt;
        }

        return sb.toString();
    }
}
