import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        //어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 
        /**
		 * -전화번호 배열 요소들을 길이 순으로 정렬
		 * -배열의 길이만큼 반복문을 돌면서 전화번호를 하나씩 쪼개어 set에 담긴 전화번호가 있는지 체크.
		 * -일치하면 접두어가 존재하는 것이기 때문에 반복문 탈출.
		 * -일치하지 않으면, 새로운 전화번호 set에 저장.
		 */
        boolean answer = true;
        HashSet<String> phoneSet = new HashSet<>();
        
        // 문자열 길이에 따라 정렬
        Arrays.sort(phone_book, (a, b) -> a.length() - b.length()); 

        for (String phone : phone_book) {
            // HashSet에 이미 존재하는 접두어가 있는지 확인
            for (int i = 1; i <= phone.length(); i++) {
                if (phoneSet.contains(phone.substring(0, i))) {
                    answer = false;
                    break;
                }
            }

            if (!answer) break;

            // 현재 전화번호 HashSet에 추가
            phoneSet.add(phone);
        }

        return answer;
    }
}