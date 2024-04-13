import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //초기 비용 H, 투자 기간 Y 입력
		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
        //다이나믹프로그래밍 배열 선언
		int[] dp = new int[Y+1];
        
        //초기값
		dp[0] = H; 
		
		for(int i=1 ; i<=Y ; i++) {
			dp[i] = (int)(dp[i-1] * 1.05);
			
			if(i >= 3) {
				dp[i] = Math.max((int)(dp[i-3] * 1.2), dp[i]);
			}
			if(i>= 5) {
				dp[i] = Math.max((int)(dp[i-5] * 1.35), dp[i]);
			}
		}
        
		System.out.println(dp[Y]);
	}
}