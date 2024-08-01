import java.util.*;
import java.io.*;

public class Main {
	static final long mod = 1000000007;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //산책시간 D 입력
		int D = Integer.parseInt(br.readLine());
        
        //다이나믹프로그래밍 배열 선언
		long[][] dp = new long[D+1][8];
		
        //초기값 입력
        dp[0][0] = 1;

		for(int i=0 ; i<D ; i++) {
			dp[i+1][0] = (dp[i][1] + dp[i][2]) % mod;
			dp[i+1][1] = (dp[i][0] + dp[i][2] + dp[i][3]) % mod;
			dp[i+1][2] = (dp[i][0] + dp[i][1] + dp[i][3] + dp[i][5]) % mod;
			dp[i+1][3] = (dp[i][1] + dp[i][2] + dp[i][4] + dp[i][5]) % mod;
			dp[i+1][4] = (dp[i][3] + dp[i][5] + dp[i][6]) % mod;
			dp[i+1][5] = (dp[i][2] + dp[i][3] + dp[i][4] + dp[i][7]) % mod;
			dp[i+1][6] = (dp[i][4] + dp[i][7]) % mod;
			dp[i+1][7] = (dp[i][5] + dp[i][6]) % mod;
		}

		System.out.println(dp[D][0]);
	}
}