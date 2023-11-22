import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //다이나믹 프로그래밍 활용하여 풀기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //피자 판의 개수 입력
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍 배열 선언(N은 최대 10이므로 11까지)
        int[] dp = new int[11];
        
        //초기값 할당
        dp[1] = 0;
        dp[2] = 1;
        
        //점화식
        for (int i=3 ; i<=N ; i++) {
            dp[i] = i-1 + dp[i-1];
        }
                
        System.out.print(dp[N]);
    }
}