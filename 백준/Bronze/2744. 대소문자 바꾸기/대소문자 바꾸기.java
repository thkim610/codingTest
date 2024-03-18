import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String S = s.toLowerCase();
		String answer = "";
		
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)==S.charAt(i)) {
				answer += (s.charAt(i)+"").toUpperCase();
			}else {
				answer += (s.charAt(i)+"").toLowerCase();
			}
		}
		
		System.out.println(answer);

	}

}

