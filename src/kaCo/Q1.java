package kaCo;

public class Q1 {
	public static void main(String[] args) {
		int[] gift_cards = {4, 5, 3, 2, 1};
		int[] wants = {2, 4, 4, 5, 1};
		
		System.out.println(solution(gift_cards, wants));
	}
	
    public static int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        int cards_ptr = 0;
        int wants_ptr = 0;
        
        while (wants_ptr <= wants.length) {
            if (wants[wants_ptr] == gift_cards[cards_ptr]) {
            	if (wants_ptr == cards_ptr) {
                	wants_ptr++;
            		cards_ptr = wants_ptr;
            		continue;
            	}
            	int tmp = gift_cards[cards_ptr];
            	gift_cards[cards_ptr] = gift_cards[wants_ptr];
            	gift_cards[wants_ptr] = tmp;
            	
            	wants_ptr++;
        		cards_ptr = wants_ptr;
            } else {
            	cards_ptr++;
            	if (cards_ptr >= wants.length) {
            		
                	wants_ptr++;
            		cards_ptr = wants_ptr;
            	}
            }
            System.out.println("wants_ptr : " + wants_ptr);
            System.out.println("cards_ptr : " + cards_ptr);
        }
        
        for (int i = 0; i < wants.length; i++) {
        	if (wants[i] != gift_cards[i]) {
        		System.out.println("wants[i] : " + wants[i]);
        		System.out.println("gift_cards[i]" + gift_cards[i]);
        		answer++;
        	}
        }
        return answer;
    }
}
