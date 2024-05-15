import java.util.*;
class Solution {
    public int solution(String s) {
		int answer = 0;

		String[] numWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		// HashMap 생성
		HashMap<String, Integer> map = new HashMap<>();

		String numStr = "";
		String number = "";

		// 배열의 각 요소를 맵에 추가
		for (int i = 0; i < numWords.length; i++) {
			map.put(numWords[i], i);
		}

		char[] c = s.toCharArray();

		int num = 0;
		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(numStr)) {
				num = map.get(numStr);
				number += num + "";
				numStr = "";
			}

			// 문자 값이 숫자인 경우 체크
			if (c[i] >= '0' && c[i] <= '9') {
				number += c[i] + "";
				continue;
			}

			numStr += c[i] + "";

		}

		if (map.containsKey(numStr)) {
			num = map.get(numStr);
			number += num + "";
			numStr = "";
		}

		answer = Integer.parseInt(number);
        return answer;
    }
    
  
}