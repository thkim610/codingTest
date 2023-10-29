class Solution {
    public String solution(String my_string) {
        //문자열의 길이를 구함. -> String.length()
        int max = my_string.length();
        //문자열을 문자로 담는 배열 생성
        char[] words = new char[max];
        //반복문을 돌면서 문자열의 문자를 거꾸로 배열에 담음.
        for(int i=0; i<max; i++){
                char w = my_string.charAt(i);
                words[max-(i+1)] = w; 
            }
        String answer = new String(words); //문자 배열을 문자열로 변환.
        return answer;
    }
}