class Solution {
    public int solution(int n) {
        int pizzaCnt = 1; //피자의 수
        //피자의 조각을 n명씩 나누었을때 조각이 남으면 피자 수 증가
        while (true){
            int pizzaPiece = pizzaCnt*6; //피자의 조각
            if(pizzaPiece%n!=0){
               pizzaCnt++; 
            }else{
                break;
            }
            
        }
        
        int answer = pizzaCnt;
        return answer;
    }
}