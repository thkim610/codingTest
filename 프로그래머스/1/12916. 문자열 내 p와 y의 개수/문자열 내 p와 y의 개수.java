class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount = 0;
        int ycount = 0;
        
        String [] arr = s.split(""); //문자열을 문자 배열로 저장.
       
        //반복문을 돌면서 대소문자 무시하고 p와 y의 개수 구함.
        for(int i = 0; i<arr.length; i++){
            if("p".equalsIgnoreCase(arr[i])){
                pcount++;
            }else if("y".equalsIgnoreCase(arr[i])){
                ycount++;
            }
            
        }
        //p와 y의 개수 비교
       if(pcount == ycount){
                answer = true;
            }else{
                answer = false;
            }

        return answer;
    }
}