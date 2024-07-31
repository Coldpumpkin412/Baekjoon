import java.util.*;
import java.io.*;

public class Main {
    private static final int mod = 1000000007;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //싸움시간 N, 출전시간 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //다이나믹 프로그래밍 배열 선언
        int[] dp = new int[N+1];
        
        //초기값 선언
        dp[0] = 1;
        
        for(int i=1 ; i<=N ; i++) {
            dp[i] = dp[i-1];
            
            if(i-M < 0) {
                continue;
            }
            
            //점화식
            dp[i] += dp[i-M];
            dp[i] %= mod;
        }
        
        System.out.println(dp[N]);
    }
}