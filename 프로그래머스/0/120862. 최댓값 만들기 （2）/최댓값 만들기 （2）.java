import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        //배열을 정렬한다.
        Arrays.sort(numbers);
        
        //배열의 가장 큰 값(양수) 2개와 가장 작은 값(음수) 2개를 곱한 값을 비교한다.
       int answer = Math.max(numbers[0]*numbers[1], numbers[numbers.length-1]*numbers[numbers.length-2]);
        
        return answer;
    }
}