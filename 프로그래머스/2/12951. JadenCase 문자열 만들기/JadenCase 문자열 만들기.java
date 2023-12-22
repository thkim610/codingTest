class Solution {
    public String solution(String s) {
        String answer = "";
    	
    	// " " 기준으로 문자열 잘라서 배열에 넣음
    	String[] arr = s.split(" ");
    	// 잘린 문자열을 순서대로 처리
    	for(int i=0; i<arr.length; i++) {
    		String now = arr[i];
    		
    		// 문자열의 길이가 0이라면(공백 이라면)
    		// answer에 " "만 추가
    		if(arr[i].length() == 0) {
    			answer += " ";
    		} 
    		// 문자가 있다면
    		else {
    			// 0번째 문자는 대문자로
    			answer += now.substring(0, 1).toUpperCase();
    			// 1번째 문자부터 마지막까지는 소문자로
    			answer += now.substring(1, now.length()).toLowerCase();
    			// 마지막에 " " 추가
    			answer += " ";
    		}
    		
    	}
    	
    	// 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
    	if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	}
    	
    	// 맨 마지막 " " 제거하고 answer 반환
        return answer.substring(0, answer.length()-1);
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