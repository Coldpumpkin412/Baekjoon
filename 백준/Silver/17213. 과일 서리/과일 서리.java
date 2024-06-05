import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));              
        
        //과일 종류의 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //훔치려 하는 과일의 수 M 입력
        int M = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍 배열 선언
        int[][] dp = new int[11][31];
        
        //dp초기값 선언
        for(int i=1 ; i<=M ; i++) {
            dp[1][i] = 1;
        }
        
        //dp 초기값 선언
        for(int i=1 ; i<=N ; i++) {
            dp[i][i] = 1;
        }
        
        for(int i=2 ; i<=N ; i++) {
            for(int j=i ; j<=M ; j++) {
                //점화식
                dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
            }
        }
        
        //결과 출력
        System.out.print(dp[N][M]);
    }
}