import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 정렬
		int answer = 0;
		int max = array[array.length-1]; //가장 큰 수를 max로 설정
		//각 숫자에 대한 count배열 생성 (배열 index는 0부터 이기 때문에 사이즈는 max+1)
		int[] count = new int[max+1];
		for(int i=0; i<array.length; i++) {
			count[array[i]]++; // 각 숫자 인덱스에 횟수 증가
		}
		max = count[0]; //초기화
		//가장 큰 count값을 max로 설정
		for(int i=1; i<count.length;i++) {
			if(max<count[i]) {
				max = count[i];
				answer = i;
			}else if(max==count[i]) {//빈도수가 같으면
				answer = -1;
			}
		}
        return answer;
    }
}