class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        // 놀이기구 n번 탄 총 금액
        long cost = 0;
        
        for(int i=1; i<=count; i++){
            cost += price*i;
        }
        
        //부족한 금액
        if(money>cost){
            return 0;
        }
        answer = cost - money;

        return answer;
    }
}