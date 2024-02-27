import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
		
		
		HashMap<String, Integer> clothesMap = new HashMap<>();
		
		//종류와 옷 개수를 매핑한 hashMap 생성.
		for(int i=0; i<clothes.length; i++) {
            //종류가 없으면, 맵에 종류 1개를 기본으로 저장. 
			if(!clothesMap.containsKey(clothes[i][1])) {
				clothesMap.put(clothes[i][1], 1);				
			}else { //있으면, 개수를 +1 증가.
				clothesMap.put(clothes[i][1], clothesMap.get(clothes[i][1])+1);
			}
			
		}
		
		
		//공식 : (a+1)(b+1)...(해당 옷 종류의 개수 +1)-1
		for( String key : clothesMap.keySet()){
            answer *= clothesMap.get(key)+1;
        }
		
		answer -= 1;
        
        return answer;
		
    }
}