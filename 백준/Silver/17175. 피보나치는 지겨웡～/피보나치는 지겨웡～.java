import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍 활용 배열 선언 (N이 50까지이므로 51까지 미리 선언)
        long[] dp = new long[51];
        
        //초기값 할당
        dp[0] = 1;
        dp[1] = 1;
        
        //점화식활용 *1,000,000,007로 나눈 나머지이므로 점화식마다 나눠주기
        for(int i=2 ; i<=N ; i++) {
            dp[i] = (dp[i-1]+dp[i-2]+1) % 1000000007;
        }
        
        //정답 출력
        System.out.print(dp[N]);
    }
}