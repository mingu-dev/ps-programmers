package coding_test.wtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q6 {

	public static void main(String[] args) {
		String[] logs = { "1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100", "1902 2 100",
				"1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100",
				"1903 2 100", "1903 1 100", "2001 1 100", "2001 2 100", "2001 4 100", "2001 7 95", "2001 9 100",
				"2002 1 95", "2002 2 100", "2002 4 100", "2002 7 100", "2002 9 100" };

		solution(logs);
	}

	public static String[] solution(String[] logs) {
		// 두 사람이 1. 푼 문제수 2. 푼 문제 번호 3. 푼 문제 점수가 모두 같을 때 둘 다 부정행위자이다
		/*
		 * 예외 1. 푼 문제가 5문제 '미만'인 경우는 제외한다. 2. 같은 문제에 대해 여러번 답안을 제출할 수 있다. 그 경우, '마지막' 제출
		 * 점수가 최종 점수이다. 3. 문제를 풀지 않은 경우는 log에 기록되지 않고, 0점으로 log에 기록된 경우 문제를 푼 것으로 간주한다.
		 */
		String[] answer = new String[logs.length];
		Set<Integer> set = new HashSet<>();
		Map<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
		List<Integer> students_num = new ArrayList<>();
		List<Integer> solved_counting = new ArrayList<>();

		// Set으로 총 학생 번호를 찾는다.
		for (int i = 0; i < logs.length; i++) {
			set.add(Integer.parseInt(logs[i].substring(0, 4)));
		}
		// Set으로 인해 중복이 제거 된 학생 번호를 Map에 담는다.
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			map.put(iterator.next(), new HashMap<Integer, Integer>());
		}
		// 학생 번호를 재사용하기 위해서 List에 담아둔다.
		Iterator<Integer> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			students_num.add(iterator2.next());
		}
		// 학생들의 점수를 Map에 담는다.
		for (int i = 0; i < logs.length; i++) {
			int student = Integer.parseInt(logs[i].substring(0, 4));
			int problem = Integer.parseInt(logs[i].substring(5, 6));
			int score = Integer.parseInt(logs[i].substring(7));
			map.get(student).put(problem, score);
		}
		// 5문제 미만으로 푼 학생은 부정행위 대상이 아니므로, 먼저 map에서 지운다.
		for (int i = 0; i < map.size(); i++) {
			if (map.get(students_num.get(i)).size() < 5) {
				map.get(students_num.get(i)).clear();
				students_num.remove(i);
				continue;
			}
		}

		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < map.size(); i++) {
			for (int j = i; j < map.size(); j++) {
				Set<Integer> first_keys = map.get(students_num.get(i)).keySet();
				Set<Integer> second_keys = map.get(students_num.get(j)).keySet();
				if (first_keys.equals(second_keys)) {
					for (Integer key : first_keys) {
						if (!(map.get(students_num.get(i)).get(key)).equals(map.get(students_num.get(j)).get(key))) {
							break;
						} else {
							list.add(students_num.get(i).toString());
							list.add(students_num.get(j).toString());
						}
					}
				}
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

}
