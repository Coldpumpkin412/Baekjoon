import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 다이나믹프로그래밍 활용
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 T 입력
        int T = Integer.parseInt(br.readLine());
        
        //다이나믹프로그래밍 활용 배열 선언(n이 67까지 이므로 68까지 선언)
        long[] dp = new long[68];
        
        //배열 초기값 입력
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for (int i=4 ; i<=67 ; i++) {
            //점화식 활용하여 값 할당
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];
        }
        
        while(T-->0) {
            //구하고자 하는 N번째 피보나치 수 입력
            int N = Integer.parseInt(br.readLine());
            
            sb.append(dp[N]).append("\n");
        }
        
        System.out.print(sb);
    }
}