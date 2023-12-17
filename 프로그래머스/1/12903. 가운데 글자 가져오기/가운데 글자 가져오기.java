class Solution {
    public String solution(String s) {
        int length = s.length(); //단어의 길이
        String answer = "";
        if(length%2==0){ // 단어의 길이가 짝수이면, 단어의 길이의 절반 인덱스와 그 다음을 추출
            answer = s.substring((length/2)-1,length/2+1);
        }else{ // 단어의 길이가 홀수 이면, 가운데 글자를 반환
            answer = s.charAt(length/2)+"";
        }
        return answer;
    }
}