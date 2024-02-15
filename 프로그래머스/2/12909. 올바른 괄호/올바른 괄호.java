import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
		
		Deque<Character> braket = new ArrayDeque<>();
		
		//문자열 시작이 닫는 괄호이거나 문자열 끝이 여는 괄호면 false
		if(s.startsWith(")")||s.endsWith("(")) {
			return false;
		}
		
		//문자열을 데크에 담음.
		for(char c : s.toCharArray()) {
			if(c=='(') {
				braket.push(c); // 여는 괄호면 데크에 담음.
			}else if(c==')' && !braket.isEmpty()) {
				braket.pop(); // 문자가 닫는 괄호)이면서, 처음으로 시작하지 않으면 여는 괄호(를 데크에서 제거.
			}
		}
		
		//데크 안에 문자가 남아있으면 false, 없으면 true
		 answer = braket.isEmpty() ? true : false;

        return answer;
    }
}