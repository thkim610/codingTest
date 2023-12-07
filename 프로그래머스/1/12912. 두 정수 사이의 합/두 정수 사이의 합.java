class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = 0;
        int min = 0;
        
        // 두 a,b를 비교하여 큰 값과 작은 값을 정의함.
        if(a>=b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        
        // 작은 값부터 1씩 증가시켜 큰 값까지 더한다.
        for(int i = min; i<= max; i++){
            answer += i;
        }
        
        return answer;
    }
}