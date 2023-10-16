import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        //다이나믹 프로그래밍 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //구하고자 하는 수 입력
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹프로그래밍 배열 입력 및 초기값 입력
        long[] dp = new long[1000001];
        dp[1] = 1;
        
        //피보나치 알고리즘 및 나머지 성질 활용
        for (int i=2 ; i<=N ; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        
        System.out.print(dp[N]);
    }
}
