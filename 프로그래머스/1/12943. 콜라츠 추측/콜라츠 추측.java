class Solution {
    public int solution(int num) {
        int answer = 0;
        //num == 1일때
        if(num==1){
            return 0;
        }
        // num == 1이 아닐 때
        while(num!=1){
            //500번을 반복할 동안 1이 되지 않으면 -1을 반환
            if(answer > 500){
                answer = -1;
                break;
            }
            //입력된 수가 짝수이면, 2로 나눈다.
            if(num % 2 == 0){
                num /= 2;
            }
            //입력된 수가 홀수이면, 3을 곱하고 1을 더한다.
            else if(num % 2 == 1){
                num = num*3+1;
            }
            answer++;
            
        }
        
        return answer;
    }
}