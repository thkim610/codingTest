import java.util.Scanner;

public class Main {
    public static int[] alphabetCount(String str) {
        int[] count = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int[] a_count = alphabetCount(a);
        int[] b_count = alphabetCount(b);
        
        int answer = 0;
        for (int i = 0; i < 26; i++) {
            answer += Math.abs(a_count[i] - b_count[i]);
        }
        
        System.out.println(answer);
    }
}