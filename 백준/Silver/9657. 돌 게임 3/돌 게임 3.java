import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //다이나믹 프로그래밍 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍에 활용될 배열 선언
        int[] dp = new int[1001];
        
        //초기값 선언
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        dp[4] = 1;
        
        for (int i=5 ; i<=N ; i++) {
            dp[i] = 2;
            
            if (dp[i-1]%2 == 0 || dp[i-3]%2 == 0 || dp[i-4]%2 == 0) {
                dp[i] = 1;
            }
        }
        
        System.out.println(dp[N]==1 ? "SK" : "CY");
    }
}