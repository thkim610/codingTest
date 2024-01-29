import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// N 값 입력 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//길이 N의 숫자를 다시 입력받아 String sNum에 저장하기
		String sNum = sc.next();
		//sNum을 다시 char[]에 변환하여 저장하기
		char[] cNum = sNum.toCharArray(); //.toCharArray() : String 문자열을 char 배열로 변환하는 메서드.
		
		int sum = 0; //변수 초기화
		
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i]-'0'; //배열의 각 자리값을 정수형으로 변환하며 sum에 더하기
		}
		
		System.out.println(sum);
		
	}

}