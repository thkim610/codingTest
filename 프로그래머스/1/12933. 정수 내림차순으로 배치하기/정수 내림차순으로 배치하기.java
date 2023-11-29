import java.lang.*;
import java.util.*;
class Solution {
    public long solution(long n) {
        String val = String.valueOf(n); //long 값을 String으로 변환
        String[] num = val.split(""); //각 자리 값을 하나씩 배열로 쪼갬.(문자열을 문자열 배열로)
            
        Arrays.sort(num, Comparator.reverseOrder()); //배열을 내림차순으로 정렬
        String result = String.join("",num); // 배열을 다시 문자열로 합침.

        long answer = Long.parseLong(result); // 문자열을 다시 long으로 변환.
        return answer;
    }
}