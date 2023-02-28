import java.util.*;
import java.io.*;

public class Main {
	/*
	 * 패턴을 찾아서 동적프로그래밍을 활용하여 풀기
	 * 인덱스 : 1 2 3 4 5 6 7 8 9 10 11 12 13 ...
	 *    값 : 1 2 3 1 2 3 4 2 1 2  3  4  2 ...
	 *  
	 *  즉 해당 점화식 도출 가능 인덱스(i)에 대한 값 dp[i] = Math.min(dp[i-j^2], min) + 1
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dp = new int[50001]; //입력값이 최대 50000이기 때문에 해당크기의 배열 선언
		//자연수 N입력
		int N = Integer.parseInt(br.readLine());
		
		//동적프로그래밍에 활용할 배열 초기값 선언
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2 ; i<=N ; i++) {
			int min = Integer.MAX_VALUE; //초기값
			
			for(int j=1 ; j*j<=i ; j++) {
				min = Math.min(min, dp[i-j*j]);
			}
			dp[i] = min+1;
		}
		
		System.out.println(dp[N]);
	}
}

	
