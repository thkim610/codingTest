class Solution {
    public int solution(int price) {
        double DCPrice = 0;
        if(price>=500000){ //50만원 이상
            DCPrice = price*0.2;
                
        }else if(price>=300000){ //30만원 이상
            DCPrice = price*0.1;
            
        }else if(price>=100000){ //10만원 이상
            DCPrice = price*0.05;
        }
        int answer = (int)(price-DCPrice);
        return answer;
    }
}