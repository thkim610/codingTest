class Solution {
    public int solution(int left, int right) { 
        int answer = 0;
        
        for(int j=left; j<=right; j++){
            //약수의 개수 초기화
            int factorsNum = 0;
            
            //약수의 개수를 구함.
            for(int i=1; i<=j; i++){
                if(j%i == 0){
                    factorsNum++;
                }
            }
            if(factorsNum%2!=0){//약수의 개수가 홀수이면 음수로 바꾸고 더함.
                answer += j*(-1);
                continue;
            }
            //left~right 사이의 수를 더함.
            answer += j;
        }
        
        return answer;
    }
}