import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0; //지원가능한 부서의 수
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if(budget < d[i]){
                break;
            }
            budget -= d[i];
                answer++;
        }
        
        return answer;
    }
}