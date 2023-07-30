
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //다이나믹프로그래밍 활용
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int answer = 0;
        
        //R,C,W입력
        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        
        //다이나믹프로그래밍 배열 선언 및 초기값 입력
        int[][] dp = new int[R+W+1][R+W+1];
        dp[1][1] = 1;
        
        for (int i=2 ; i<=R+W ; i++) {
            for (int j=1 ; j<=i ; j++) {
                //점화식활용하여 값 할당
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
                
        for (int i=0 ; i<W ; i++) {
            for (int j=0 ; j<=i ; j++) {
                answer += dp[R+i][C+j];
            }
        }
        
        //정답 출력
        System.out.print(answer);
    }
}