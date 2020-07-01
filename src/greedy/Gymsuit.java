package greedy;

import java.util.ArrayList;

public class Gymsuit {
	
	public static void main(String[] args) {
		
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		System.out.println(solution(5, lost, reserve));
	}

    public static int solution(int n, int[] lost, int[] reserve) {
    	
        // 1. 순서대로 없는 학생의 양 옆에 여벌이 있는 학생이 있는지 확인한다.
    	// 1-1. 여벌이 있는 학생이 없으면, 다음 없는 학생으로 넘어간다.
    	// 1-2. 여벌이 있는 학생이 1명이면, 그 학생의 여벌을 준다.
    		// 1-2-1. 여벌이 있는 학생이 2명이면, 없는 학생 앞에 있는 학생의 여벌을 준다.
    	// 2. 여벌을 받은 학생을 answer에 더해준다.
    	// cf) 여벌이 있는 사람이 도난 당한 경우 => 빌려주지도 않고, 빌리지도 않는다.
    	
        int answer = 0;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        ArrayList<Integer> rsv = new ArrayList<Integer>();
        
        for (int i = 0; i < reserve.length; i++) {
        	rsv.add(reserve[i]);
        }
        
        for (int i = 0; i < lost.length; i++) {
        	lst.add(lost[i]);
        }
        
        for (int i = 0; i < lst.size(); i++) {
        	for (int j = 0; j < rsv.size(); j++) {
        		
        		// 1. 잃어버린 학생과 여벌 있는 학생이 동일한 경우
        		if (lst.get(i) == rsv.get(j)) {
    				lst.remove(i--);
    				rsv.remove(j);
    				break;
        		}
        		
        		// 2. 잃어버린 학생 앞이 여벌 있는 학생인 경우
        		if (lst.get(i)-1 == rsv.get(j)) {
        			answer++;
        			rsv.remove(j);
        			break;
        		}
        		
        		// 3. 잃어버린 학생 뒤가 여벌 있는 학생인 경우
        		if (lst.get(i)+1 == rsv.get(j)) {
        			
        			// 근데 그 뒤 학생도 잃어버린 학생인 경우
        			if (i != lst.size() && rsv.get(j) == lst.get(i+1)) {
        				lst.remove(i+1);
        				rsv.remove(j);
        				break;
        			}
        			
        			answer++;
        			rsv.remove(j);
        			break;
        		}
        	}
        }
        answer += n - lst.size();
        return answer;
    }
}
