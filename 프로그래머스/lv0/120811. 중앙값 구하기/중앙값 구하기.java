import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        int arrayLength = array.length;
        int answer = array[arrayLength/2];
        
        return answer;
    }
}