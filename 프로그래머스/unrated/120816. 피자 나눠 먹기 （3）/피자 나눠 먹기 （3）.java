class Solution {
    public int solution(int slice, int n) {
        int pizzaCnt = n/slice;
        while(true){
            if(n%slice!=0){
                pizzaCnt++;
                break;
            }else{
                break;
            }
        }
        int answer = pizzaCnt;
        return answer;
    }
}