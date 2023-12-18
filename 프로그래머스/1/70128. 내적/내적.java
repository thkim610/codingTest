class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        // 반복문을 돌면서 같은 인덱스끼리 곱한 값을 더한다.
        for(int i = 0; i<a.length; i++){
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}