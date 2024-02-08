import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        //배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
        //단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지
		
		List<Integer> num = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(i==0){
            	num.add(arr[i]);
                continue;
            }
            //연속으로 같은 숫자의 경우, 다음으로 넘어감.
            if(arr[i-1]==arr[i]){
                continue;
            }else{
            	num.add(arr[i]);
            }
        }
        
        int[] answer = new int[num.size()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = num.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}