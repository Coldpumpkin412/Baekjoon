import java.util.*;
import java.io.*;

public class Main {
	/*
	 * 동적 프로그래밍 활용
	 * 해당 칸 까지 가는 경우의 수 = 2가지
	 * 1. n-3을 밟고 n-1을 거친 후 n으로 오기
	 * 2. n-2에서 n으로 오는경우
	 * 
	 * 1,2 번 중 최대값을 선택한다
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//계단의 개수 및 각 점수 입력(0번 인덱스는 시작점이므로 무시)
		int N = Integer.parseInt(br.readLine());
		int[] stair = new int[N+1];
		
		for(int i=1 ; i<=N ; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		//0번째 인덱스는 시작점으로 생각한 후 1번 부터 N번까지를 계단으로 하는 동적프로그래밍 배열 선언
		int[] dp = new int[N+1];

		if(N==1) { //계단이 1개인경우
			System.out.println(stair[1]);
		}else if(N==2) { //계단이 2개인 경우
			System.out.println(stair[1]+stair[2]);
		}else { //계단이 3개 이상인 경우
			
			//초기값 
			dp[1] = stair[1];
			dp[2] = stair[1]+stair[2];
			
			//1번 계단에서 두 칸 뛰는경우, 2번 계단에서 한 칸 뛰는 경우 중 최대값
			dp[3] = Math.max(stair[1], stair[2]) + stair[3];
			
			//n-3을 밟고 n-1을 밟은 값과 n-2를 밟은 값중 최댓값 + 도착지점 계단의 점수
			for(int i=4 ; i<=N ; i++) {
				dp[i] = Math.max(dp[i-3]+stair[i-1], dp[i-2]) + stair[i];
			}
            
			System.out.println(dp[N]);
		}
	}
}

	
