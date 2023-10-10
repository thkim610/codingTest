class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1*denom2)+(numer2*denom1);
        int denom = denom1*denom2;
        
        int i = 0;
        if(numer > denom){
            i = denom;
        }else{
            i = numer;
        }
        
        for(int j=i; j>0; j--){
            if(denom%j==0&&numer%j==0){
                denom /=j;
                numer /=j;
            }
            continue;
        }
        
        int[] answer = {numer, denom};
        return answer;
    }
}