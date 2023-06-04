import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //다이나믹 프로그래밍 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍에 활용할 배열 선언 및 초기값 설정
        int[] dp = new int[46];  
        dp[1] = 1;
        
        for (int i=2 ; i<=N ; i++) {
            //점화식
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.print(dp[N]);
    }
}