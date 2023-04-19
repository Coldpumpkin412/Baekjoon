import java.util.*;
import java.io.*;

public class Main {
	//다이나믹 프로그래밍에 활용할 배열 초기화(최댓값이 30이므로 31까지 선언)
	static int[][] dp = new int[31][31];
	
	public static int combination(int n, int r) {
		//이미 값이 존재하는경우
		if(dp[n][r] != 0) {
			return dp[n][r];
		}else if(n==r || r==0) {//값이 1이나오는 2가지 경우
			dp[n][r] = 1;
			return dp[n][r];
		}else {
			//재귀 활요
			return dp[n][r] = combination(n-1,r-1) + combination(n-1,r);
		}
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * 콤비네이션 및 다이나믹프로그래밍 활용하여 풀기
		 * nCr = (n-1)C(r-1) + (n-1)Cr
		 * 
		 * 즉 다이나믹프로그래밍 배열을 2차원 배열로 두어
		 * dp[n][r] = dp[n-1][r-1] + dp[n-1][r] 형태로 입력한다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			//콤비네이션 함수 실행
			System.out.println(combination(M,N));
		}
	}
}

	
