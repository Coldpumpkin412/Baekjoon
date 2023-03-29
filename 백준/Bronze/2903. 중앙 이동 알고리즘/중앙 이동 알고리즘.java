import java.util.*;
import java.io.*;	

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 저장해야하는 점의 개수는 가로줄의 점 개수의 제곱과 같다.
		 * 가로줄의 점 개수를 구하는 점화식을 먼저 구해보기
		 * 
		 * 1번 = 3개
		 * 2번 = 5개
		 * 3번 = 9개
		 * 4번 = 17개
		 * 
		 * 즉, 이전숫자 + 이전숫자 - 1 의 공식
		 */
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int answer = 0;
		 
		 //과정 N번 값 입력
		 int N = Integer.parseInt(br.readLine());
		 
		 //초기값
		 int count = 2;
		 
		 while(N-->0) {
			 count = 2*count -1;
			 answer = (int)Math.pow(count, 2);
		 }
		 
		 System.out.println(answer);
	}
}

	
