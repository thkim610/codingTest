class Solution {
    public String solution(int n) {
        String su = "수";
        String bak = "박";
        String answer = "";
        
        //반복문을 돌면서 홀수이면 '수'를, 짝수이면 '박'을 연속적으로 붙인다.
        for(int i = 1; i <= n; i++){
            answer += (i % 2 != 0) ? su : bak;
        }
        return answer;
    }
}