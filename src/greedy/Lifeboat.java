package greedy;

import java.util.ArrayList;

public class Lifeboat {
	
	public static void main(String[] args) {
		System.out.println();
	}
	
    public int solution(int[] people, int limit) {
        int answer = 0;
        // ArrayList로 people 옮김 (데이터 삭제 빠르게 하기 위함)
        ArrayList<Integer> people_list = new ArrayList<Integer>();
        for (int person : people) {
        	people_list.add(person);
        }
        
        int[] duo = new int[people.length];
        
        for (int i = 0; i < people.length; i++) {
        	for (int j = i+1; j < people.length; j++) {
            	if (people_list.get(i)+people_list.get(j) == 100) {
            		people_list.remove(i);
            		people_list.remove(j);
            		answer++;
            		i = -1;
            		break;
            	}
        	}
        }
        
        return answer;
    }
}
