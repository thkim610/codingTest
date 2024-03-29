import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 팩토리얼을 계산하는 함수 (n!)
	    long result = 1;
	    for (int i = 2; i <= n; i++) {
	         result *= i;
	    }
	    
	    System.out.println(result);


	}

}