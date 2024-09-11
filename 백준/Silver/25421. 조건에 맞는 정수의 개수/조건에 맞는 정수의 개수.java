import java.util.*;
import java.io.*;

public class Main {
    static final int mod = 987654321;
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //양의정수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍 배열  선언
        long[][] dp = new long[100001][6];
        
        //초기값 설정
        Arrays.fill(dp[1], 1);
        
        //점화식
        for(int i=2 ; i<100001 ; i++) {
            dp[i][1] = (dp[i-1][1] + dp[i-1][2] + dp[i-1][3]) % mod;
            dp[i][2] = (dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4]) % mod;
            dp[i][3] = (dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4] + dp[i-1][5]) % mod;
            dp[i][4] = (dp[i-1][2] + dp[i-1][3] + dp[i-1][4] + dp[i-1][5] + dp[i-1][4]) % mod;
            dp[i][5] = (dp[i-1][3] + dp[i-1][4] + dp[i-1][5] + dp[i-1][4] + dp[i-1][3]) % mod;
        }
        
        int answer = 0;
        
        for(int i=1 ; i<5 ; i++) {
            answer += dp[N][i];
            
            answer %= mod;
        }
        
        answer = answer * 2 % mod;
        answer += dp[N][5];
        answer %= mod;
        
        System.out.println(answer);
    }
}