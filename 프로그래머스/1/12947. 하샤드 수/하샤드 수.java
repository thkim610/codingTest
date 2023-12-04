class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        if(x>=1000){ //x가 4자리수 일때
            int a = x/1000;
            int b = (x%1000)/100;
            int c = (x%1000%100)/10;
            int d = x%1000%100%10;
            
            if(x%(a+b+c+d)==0){
                answer = true;
            }
        }else if(x<1000 && x>=100){ //x가 3자리 수일때
            int a = x/100;
            int b = (x%100)/10;
            int c = x%100%10;
            
            if(x%(a+b+c)==0){
                answer = true;
            }
        }else if(x<100 && x>=10){ //x가 두자리 수 일때
            int a = x/10;
            int b = x%10;
            
            if(x%(a+b)==0){
                answer = true;
            }
        }else{
            answer = true; // x가 10000일때
        }
        
        return answer;
    }
}