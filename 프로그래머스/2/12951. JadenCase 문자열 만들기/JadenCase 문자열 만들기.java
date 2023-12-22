class Solution {
    public String solution(String s) {
        String answer = "";
    	
    	// 문자열을 소문자로 만들고 문자열을 문자로 잘라서 배열에 넣음
    	String[] arr = s.toLowerCase().split("");
        //자른 문자열이 공백인지 확인하는 변수
        boolean space = true;
        
    	// 잘린 문자열을 순서대로 처리
    	for(String word : arr){
            if(space){
                answer += word.toUpperCase();
            }else{
                answer += word;
            }
            
            space = word.equals(" ")? true : false;
        }

    		return answer;
    	
        /*====================내 풀이====================*/
//         String answer = "";
//         //모든 문자를 소문자로 변환.
//         s = s.toLowerCase();
        
//         //제일 첫 글자가 숫자가 아니면 대문자로 변환.
//         //Character.isDigit() => 문자가 숫자인지 확인하는 메서드(boolean)
        
//         /*공백 다음의 글자는 대문자로 변환.*/
//         //공백을 기준으로 문자열 분할.
//         String[] words = s.split(" ");
        
//         // 반복문으로 각 단어의 첫 글자를 대문자로 변환
//         for (int i = 0; i < words.length; i++) {
//             //문자열의 길이가 0이면, " "만 추가
//             if(words[i].length()==0){
//                 answer += " ";
//             }
            
//             boolean isNumChar = Character.isDigit(words[i].charAt(0));
//             if(!isNumChar){
//                 words[i] = Character.toUpperCase(words[i].charAt(0))+words[i].substring(1);
//             }
//         }
        
//         //변환된 문자열 배열을 조합함.(join)
//         answer = String.join(" ", words);
        
//         return answer;
    }
}