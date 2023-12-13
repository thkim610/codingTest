class Solution {
    public int solution(int[] numbers) {
        // 0~9까지 더한 총 값에서 배열을 합한 값 빼기
        int totalSum = 1+2+3+4+5+6+7+8+9;
        int numbersSum = 0;
        
        //배열의 요소값 더하기
        for(int i = 0; i<numbers.length; i++){
            numbersSum += numbers[i];
        }
        
        // 총 값 - 배열의 요소 총 값 = 찾을 수 없는 값의 합
        int answer = totalSum - numbersSum;
        
        return answer;
    }
}