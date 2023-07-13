import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        /*
         * 다이나믹 프로그래밍 및 2차원 배열을 활용.
         * <점화식>
         * dp[i][1] = dp[i-1][1];
         * dp[i][2] = dp[i-2][1] + dp[i-2][2];
         * dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3]; (n >= 4)
         */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍에 활용될 배열 선언 및 초기화
		int[][] dp = new int[10001][4];
        
		dp[1][1] = 1; // 1
		dp[2][1] = 1; // 1+1
		dp[2][2] = 1; // 2
		dp[3][1] = 1; // 1+1+1
		dp[3][2] = 1; // 1+2
		dp[3][3] = 1; // 3
		
        //점화식 활용하여 값 입력
		for(int i=4 ; i<=10000 ; i++) {
			dp[i][1] = dp[i-1][1];
			dp[i][2] = dp[i-2][1] + dp[i-2][2];
			dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
		}
		
		while(T-->0){
            //n입력
            st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			sb.append(dp[n][1] + dp[n][2] + dp[n][3] + "\n");
		}
		System.out.println(sb);
	}	
}
