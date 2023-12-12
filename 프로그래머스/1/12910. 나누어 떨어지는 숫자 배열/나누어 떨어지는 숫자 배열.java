import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> a = new ArrayList<>();
        int[] answer = {};
        
        //배열 오름차순 정렬
        Arrays.sort(arr);
        
        //배열의 요소 값을 divisor로 나누었을 때 나머지가 없는지 체크
        //나누어 떨어지면 리스트에 저장 -> arrayList는 가변 길이의 배열이기 때문 
        //(배열은 크기 고정이여서 불변)
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                a.add(arr[i]);
            }
        }
        
        //나누어 떨어지는 수가 없으면 -1 반환
        if(a.size()==0){
            answer = new int[1];
            answer[0] = -1;
        }else{ // 그렇지 않으면 리스트의 크기 만큼 배열에 저장
            answer = new int[a.size()];
            for(int i = 0; i<answer.length; i++){
                answer[i] = a.get(i);
            }
        }
        
        return answer;
    }
}