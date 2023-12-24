import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        //문자열을 문자열 배열로 문자 하나씩 저장(split)
        String[] arr = s.split("");
        //배열을 오름차순으로 정렬 (Arrays.sort)
        //정렬 시, 대문자 > 소문자 순으로 정렬됨.
        Arrays.sort(arr);
        
        //배열을 다시 내림차순으로 정렬
        //정렬 시, 소문자 > 대문자 순으로 정렬됨.
        int lastIndex = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            //순서 뒤집기(내림차순으로 정렬)
            String tmp = arr[i];
            arr[i] = arr[lastIndex-i];
            arr[lastIndex-i] = tmp;

        }           
            //배열의 값 하나씩 더함.
            for(String ss : arr){
                answer += ss;
            }
        
        return answer;
    }
}