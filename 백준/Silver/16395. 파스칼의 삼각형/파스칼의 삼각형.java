import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        //다이나믹 프로그래밍 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //다이나믹 프로그래밍 배열 선언 및 초기값 입력
        int[][] dp = new int[N+1][N+1];
        dp[1][1] = 1;
        
        //점화식 활용
        for (int i=2 ; i<=N ; i++) {
            for (int j=1 ; j<=i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        
        System.out.print(dp[N][K]);
    }
}