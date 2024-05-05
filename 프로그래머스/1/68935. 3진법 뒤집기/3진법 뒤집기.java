import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        //스택을 활용하면 FILO 으로 가장 마지막 순서부터 꺼낼 수 있음.
        Stack<Integer> stack = new Stack<>();
        
        //자연수를 3진법으로 변환하여 스택에 저장.
        while(n > 0){
            stack.add(n % 3);
            n /= 3;
        }
        
        int pow = 0;
        
        while(!stack.isEmpty()){
            answer += stack.pop() * Math.pow(3, pow++);
        }
        
        return answer;
    }
}