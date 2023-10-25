class Solution {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n); // x값을 구함.
        long testNum = (long)Math.pow(sqrt,2); // x값을 다시 제곱한 값
        long answer = 0;
        if(n == testNum){ // 주어진 n과 x의 제곱이 같은지 비교
            answer = (long)Math.pow(sqrt+1,2);
        }else{
            answer = -1;
        }

        return answer;
    }
}