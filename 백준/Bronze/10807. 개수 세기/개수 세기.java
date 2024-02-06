import java.util.*;

public class Main {

	public static void main(String[] args) {
		//변수 N에 수 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//길이가 N인 1차원 배열 A[] 선언하기
		int[] A = new int[N];
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt(); //1<= n <= 100
		}
        
        int v = sc.nextInt();
        int cntNum = 0; //
		
        for(int i=0; i<A.length; i++) {
			if(v==A[i]){
                ++cntNum;
            }
		}
        
        System.out.println(cntNum);

	}

}
