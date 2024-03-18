import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next().toUpperCase(); //대문자 값을 반환하므로 대문자로 변경.
		char answer = ' ';
		
		Map<Character, Integer> words = new HashMap<>(); // '알파벳(key)-횟수(value)' 쌍으로 Map에 저장.
		
		for(int i=0; i<s1.length(); i++) {
			//맵 크기가 0이거나, 해당 알파벳이 없다면 맵에 추가.
			if(words.size()==0 || !words.containsKey(s1.charAt(i))) {
				words.put(s1.charAt(i), 1);
			}else { //해당 알파벳이 있으면, 횟수 증가.
				int cnt = words.get(s1.charAt(i));
				words.replace(s1.charAt(i), ++cnt);
			}
		}
		
		int max = 0;
		Stack<Character> maxAlphabet = new Stack<>(); //문자 빈도 수가 같을 수 있기 때문에 스택에 저장.
		
		for(char key : words.keySet() ) {
			//횟수가 많은 알파벳이면, max값 변경하고, 스택에 알파벳 저장.
			if(max < words.get(key)) {
				max = words.get(key);
				
				while(!maxAlphabet.isEmpty()) { //만약 스택에 값이 있다면 꺼냄.
					maxAlphabet.pop();
				}
				
				maxAlphabet.add(key);
				
			}else if(max == words.get(key)) { // 횟수가 max랑 같으면 스택에 추가.
				maxAlphabet.add(key);
			}
			
		}
		
		if(maxAlphabet.size()>1) { // 스택 크기가 1이상이면, 같은 횟수 알파벳이 여러 개니까 ? 반환. 
			answer = '?';
		}else {
			answer = maxAlphabet.get(0); // 해당 문자를 반환.
		}
		
		System.out.println(answer);

	}

}
