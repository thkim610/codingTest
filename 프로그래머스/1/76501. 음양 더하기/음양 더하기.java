class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        //반복문을 absolutes의 배열의 길이만큼 돌면서 양수, 음수 설정 후 더한다.
        for(int i = 0; i< absolutes.length; i++){
            //signs[i]가 true이면, 양수 그대로 더함.
            if(signs[i]){
                answer += absolutes[i];
            //false이면, -1을 곱하여 음수를 만든 후 더함.
            }else{
                answer += absolutes[i]*(-1);
            }
        }
        return answer;
    }
}