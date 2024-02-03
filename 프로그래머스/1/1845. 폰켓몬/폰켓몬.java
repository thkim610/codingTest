import java.util.*;
class Solution {
    public int solution(int[] nums) {

		 //총 포켓몬 수 / 2 만큼 선택가능.
        int selectCnt = nums.length/2;
        
        //가장 다양한 포켓몬을 가질 수 있는 수를 구하라.
        //nums를 HashSet을 통해 중복 제거.
        HashSet<Integer> hashNums = new HashSet<>();
        
        for(int i : nums){
        	hashNums.add(i);
        }
        
        //선택할 수 있는 개수 > 종류 => 종류
        //선택할 수 있는 개수 < 종류 => 개수
        int answer = Math.min(selectCnt, hashNums.size());
        
        return answer;
    }
}