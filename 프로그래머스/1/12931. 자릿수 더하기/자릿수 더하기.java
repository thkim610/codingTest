import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
       while(n != 0){
            answer += n % 10; //10으로 나눠 나머지 값 더하기
            n = n/10; //10의 자리씩 잘라냄.
        }

        return answer;
    }
}