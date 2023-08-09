import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //다이나믹 프로그래밍 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //K입력 및 dp배열 선언
        int k = Integer.parseInt(br.readLine());
        int[][] dp = new int[2][46];
        
        //다이나믹프로그래밍 배열 초기값 입력
        dp[0][2] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        
        //점화식 활용하여 값 넣어주기
        for (int i=3 ; i<=k ; i++) {
            dp[0][i] = dp[0][i-2] + dp[0][i-1];
            dp[1][i] = dp[1][i-2] + dp[1][i-1];
        }
        System.out.print(dp[0][k] + " " + dp[1][k]);
    }
}