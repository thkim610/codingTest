class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        //문자열의 길이가 4,6인지 검증
        if(!(s.length()==4||s.length()==6)){
            answer = false;
            return answer;
        }
        
       //문자열을 문자로 변환하여 반복문을 돌면서 Character.isDigit()으로 문자가 숫자인지 판별하여
		//문자가 있으면 false를 반환한다.
        for(int i=0; i<s.length(); i++) {
        	char check = s.charAt(i);
        	
        	if(!Character.isDigit(check)) {
        		answer = false;
                break;
        	}
        }
        return answer;
    }
}