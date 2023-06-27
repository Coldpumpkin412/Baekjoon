import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 다이나믹 프로그래밍 활용하여 풀기
		 * 위에부터 아래로 내려오며 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//삼각형의 크기 N 입력
		int N = Integer.parseInt(br.readLine());
		
		//삼각형 배열 및 다이나믹프로그래밍에 활용될 배열 선언
		int[][] triangle = new int[N+1][N+1];
		int[][] DP = new int[N+1][N+1];
		
		for(int i=1 ; i<=N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=1 ; j<=i ; j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//다이나믹 프로그래밍 점화식 활용하여 최대값으로 최신화
		for(int i=1 ; i<=N ; i++) {
			for(int j=1 ; j<=N ; j++) {
				//위에서부터 내려오며 큰 값을 아래에 값과 더해주기
				DP[i][j] = Math.max(DP[i-1][j-1], DP[i-1][j]) + triangle[i][j];
				}
		}
		
		//마지막층에 최댓값을 구해주기
		int answer = 0;
		for(int i=1 ; i<=N ; i++) {
			answer = Math.max(answer, DP[N][i]);
		}
		
		System.out.println(answer);
	}
}	
