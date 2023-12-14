class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0]; //임의의 배열 값을 기준 잡음.
         //배열의 길이가 1이면, -1을 할당하고 반환
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        //제일 작은값 찾기
        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        
        //정답 배열의 인덱스 생성 (작은 값이 어느 배열에 들어있는지 모르기 때문)
        int index = 0;
        //가장 작은 값을 제외한 배열 값 저장
        answer = new int[arr.length-1];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==min){ // arr[i] 값이 제일 작은 값이면, 배열에 넣지 않고 반복문을 넘어감.
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}