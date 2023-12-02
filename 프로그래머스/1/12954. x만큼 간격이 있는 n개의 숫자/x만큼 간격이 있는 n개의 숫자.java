class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long num = 0;
        for(int i = 0; i<answer.length; i++){
                answer[i] = x*(i+1); 
        }
        
        return answer;
    }
}