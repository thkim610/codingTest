import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//변수 N에 과목의 수 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//길이가 N인 1차원 배열 A[] 선언하기
		int[] A = new int[N];
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt(); //배열의 과목 점수 저장.
		}
		
		long max = 0;
		long sum = 0;
		
		for(int j=0; j<A.length; j++) {
			if(A[j]>max) {
				max = A[j]; //반복문을 돌면서 배열 값이 최대값보다 크면 max 업데이트.
			}
			sum += A[j]; //총점
		}
		
        double avg = sum * 100.0 / max / N;
        
		System.out.println(sum * 100.0 / max / N);

	}

}