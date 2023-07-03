import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 다이나믹프로그래밍 활용하여 풀기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        //다이나믹 프로그래밍에 활용될 배열 
        int[][] dp = new int[n+1][n+1];
        
        for (int i=1 ; i<=n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1 ; j<=n ; j++) {
                //배열입력값에 따라 다이나믹프로그래밍 배열 또한 누적합으로 최신화
                dp[i][j] = dp[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }
        
        for (int k=1 ; k<=m ; k++) {
            int sum = 0;
            
            //시작점 및 도착점 입력
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for (int i=x1 ; i<=x2 ; i++) {
                //같은 행을 기준으로 도착점까지의 누적합 - 시작점까지의 누적합이 범위에 해당하는 행의 합
                sum = sum + (dp[i][y2] - dp[i][y1-1]);
            }
            sb.append(sum + "\n");
        }
        
        System.out.print(sb);
    }
}