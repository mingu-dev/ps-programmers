package exhaustive_search;

import java.util.HashSet;
import java.util.Set;

public class Q42839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    public int solution(String numbers) {
    	int answer = 0;
    	boolean prime = false;
    	// 1. 숫자를 하나씩 만든다.
    	String[] arr = numbers.split("");
    	for (int i = 0; i < arr.length; i++) {
    		prime = isPrime(Integer.parseInt(arr[i]));
    	}
    	// 2. 소수인지 판별한다.
    	if (prime == true) {
    		
    	} else {
    		
    	}
    	
    	return answer;
    }
    
    private boolean isPrime(int parseInt) {
		// TODO Auto-generated method stub
		return false;
	}

	public void getAllPrimeToNum(int num) {
        if(num <= 1) return;
        
        boolean[] arr = new boolean[num+1];    //true 이면 해당 인덱스 소수.
        arr[0] = arr[1] = false;
        for(int i=2; i<=num; i+=1) {
            arr[i] = true;
        }
 
        //2 부터 숫자를 키워가며 배수들을 제외(false 할당)
        for(int i=2; i*i<=num; i+=1) {
            for(int j=i*i; j<=num; j+=i) { // i만큼 더해줘서 j를 i의 배수를 선택하게 한다.
                arr[j] = false;
            }
        }
        for(int i=0; i<=num; i+=1) {
            if(true == arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
