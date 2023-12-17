class Solution {
    public String solution(String phone_number) {
        
        //전화번호에서 맨 뒤 4자리를 잘라서 저장.
        String lastNum = 
            phone_number.substring(phone_number.length()-4, phone_number.length());
        
        //맨 뒤 4자리를 제외한 전화번호의 길이
        int replaceLength = phone_number.length() - 4;
        // '*'로 변환할 전화번호 초기화
        String replaceNumber = "";
        
        //맨 뒤 4자리를 제외한 전화번호의 길이만큼 '*'로 변환.
        for(int i = 0; i<replaceLength; i++){
            replaceNumber += "*";
        }
        
        //'*'로 변환한 문자와 맨 뒤 4자리 번호를 합침
        String answer = replaceNumber + lastNum;
        return answer;
    }
}