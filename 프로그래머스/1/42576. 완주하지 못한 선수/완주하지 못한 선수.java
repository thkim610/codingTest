import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        //마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return
        
        		HashMap<String, Integer> participantPl = new HashMap<String, Integer>();
		
		String answer = "";
		
		for(String pl : participant) {
			//동명이인의 선수가 있을 경우
			if(participantPl.containsKey(pl)) {
				participantPl.put(pl, participantPl.get(pl)+1);
			}else {
				participantPl.put(pl, 1);				
			}
		}
		
		for(int i=0; i<completion.length; i++) {
			if(participantPl.get(completion[i])> 1) {
				participantPl.replace(completion[i], participantPl.get(completion[i])-1);
				continue;
			}else {
				participantPl.remove(completion[i]);
			}
		}
		
		String failPl = participantPl.keySet().toString();
		
		answer = failPl.substring(1,failPl.length()-1); // [] 제거.
		
        return answer;
    }
}