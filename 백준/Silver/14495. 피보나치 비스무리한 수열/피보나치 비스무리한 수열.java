import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 다이나믹 프로그래밍 활용
         */
        Scanner sc = new Scanner(System.in);
        
        //N입력
        int N = sc.nextInt();
        long[] dp = new long[117];
        
        //다이나믹프로그래밍 배열 초기값
        dp[1] = dp[2] = dp[3] = 1;
        for (int i=4 ; i<=N ; i++) {
            dp[i] = dp[i-1] + dp[i-3];
        }
        
        System.out.print(dp[N]);
    }
}