import java.util.*;
class Solution {
    public Object[] solution(int[] progresses, int[] speeds) {
       		List<Integer> days = new ArrayList<Integer>();
		List<Integer> functions = new ArrayList<Integer>();
		
		
		int totalDate = 0; //소요된시간(일)
		int function = 0; //완료된 기능
		// 100-진행상황%진행속도
		// 나머지가 있으면, +1일
		for(int i=0; i<progresses.length; i++) {
			int totalDateCheck = (100 - progresses[i]) % speeds[i];
			
			if(totalDateCheck==0) {
				totalDate = (100 - progresses[i]) / speeds[i];
			}else {
				totalDate = (100 - progresses[i]) / speeds[i] + 1;
			}
			
			days.add(totalDate);
		}
		
		int biggest = days.get(0); 
		
		for(int i=0; i<days.size(); i++) {
			//앞 프로세스 수행시간과 비교해서 뒤가 짧으면 기능을 +1만 하고 넘어감.
			if(biggest>=days.get(i)) {
				++function;
				continue;
			}else {
				functions.add(function);
				biggest = days.get(i);
				function = 1;
			}
			
		}
		
		functions.add(function);
	
        
        return functions.toArray();
	
    }
}