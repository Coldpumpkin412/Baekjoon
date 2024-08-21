import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //섬의개수 N 입력
        int N = Integer.parseInt(br.readLine());
    
        //다이나믹 프로그래밍 배열 선언
        long dp[] = new long[50001];
    
        //초기값 입력
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        if(N > 3) {
            for(int i=4 ; i<=N ; i++){
                //점화식
                dp[i] = (dp[i-1]+dp[i-3]) % 1000000009;
            }
        }
        
        System.out.println(dp[N]);
    }
}