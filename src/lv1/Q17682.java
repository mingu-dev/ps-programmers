package lv1;

public class Q17682 {

	public static void main(String[] args) {

	}

	public int solution(String dartString) {
		
		int answer = 0;
		int[] scores = new int[3]; // 점수 3개를 넣을 배열
		int index = 0; // 점수 계산을 위한 인덱스.
		String tmp = ""; // 각 점수를 구분하기 위한 임시 String 변수
		
		char[] dartCha = dartString.toCharArray();
		for (int i = 0; i < dartCha.length; i++) {
			// 입력값이 숫자인 경우
			if (Character.isDigit(dartCha[i]))
				tmp += dartCha[i];
			
			// 입력값이 숫자가 아닌 경우
			else {
				// 앞에서 숫자가 나온 경우.
				if(!(tmp.equals(""))) {
					scores[index++] = Integer.parseInt(tmp); // 들어가 있는 숫자를 해당 점수칸에 넣고, 인덱스를 1 증가시킨다.
					tmp = ""; // 임시 String 변수는 초기화한다.
				}
				
				// 보너스 점수 계산
				// 앞에서 인덱스를 1 증가시켰으므로 인덱스가 1 작은 값에 대해 보너스와 옵션을 계산한다.
				switch (dartCha[i]) {
				case 'S' :
					scores[index-1] = (int)Math.pow(scores[index-1], 1);
					break;
				case 'D' :
					scores[index-1] = (int)Math.pow(scores[index-1], 2);
					break;
				case 'T' :
					scores[index-1] = (int)Math.pow(scores[index-1], 3);
					break;
				
				// 옵션 계산
				case '*' :
					scores[index-1] *= 2;
					if (index - 1 >= 1) // 현재 인덱스가 1 이상이면, 현재 스타상이 나온게 두번째 점수 이후라는 의미이므로, 첫번째 점수에 스타상을 보정한다.
						scores[index-2] *= 2;
					break;
				case '#' :
					scores[index-1] *= -1;
					break;
				}
			}
		}
		answer = scores[0] + scores[1] + scores[2];
		return answer;
  }
}
