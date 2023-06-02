import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		//다이나믹 프로그래밍 활용하여 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		
		//수열 A 값들 입력 후 배열에 저장 
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		//다이나믹프로그래밍에 활용될 배열 선언 및 초기화
		int[] dp = new int[N];
		dp[0] = 1;
		
		for(int i=1 ; i<N ; i++) {
			//우선 dp의 값을 1로 초기화
			dp[i] = 1;
			
			for(int j=0 ; j<i ; j++) {
				if(A[j]<A[i] && dp[i]<=dp[j]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		for(int number : dp) {
			max = Math.max(max, number);
		}
		
		System.out.println(max);
	}
}	
