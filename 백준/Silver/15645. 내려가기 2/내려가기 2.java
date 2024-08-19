import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N 입력
        int  N= Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍 배열 선언
        int[][][] dp = new int[N+1][3][2];
        
        for(int i=1 ; i<=N ; i++) {
            st = new StringTokenizer(br.readLine());
            
            //숫자 3개 입력
            for(int j=0 ; j<3 ; j++) {
                int num = Integer.parseInt(st.nextToken());
                                
                //초기값
                dp[i][j][1] = 900001;
                
                for(int k=j-1 ; k<=j+1 ; k++) {
                    if(k<0 || k>=3) {
                        continue;
                    }
                    
                    //점화식
                    dp[i][j][0] = Math.max(dp[i][j][0], dp[i-1][k][0]);
                    dp[i][j][1] = Math.min(dp[i][j][1], dp[i-1][k][1]);
                }
                dp[i][j][0] += num;
                dp[i][j][1] += num;
            }
        }
        int max = Math.max(dp[N][0][0], Math.max(dp[N][1][0], dp[N][2][0]));
        int min = Math.min(dp[N][0][1], Math.min(dp[N][1][1], dp[N][2][1]));
        
        System.out.println(max + " " + min);
    }
}