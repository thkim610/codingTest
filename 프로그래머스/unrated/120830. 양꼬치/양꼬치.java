class Solution {
    public int solution(int n, int k) {
        int freeCount = n/10; //서비스 음료의 개수
        k = k-freeCount; // 서비스를 제외한 음료 개수
        
        int answer = n*12000 + k*2000;
        return answer;
    }
}