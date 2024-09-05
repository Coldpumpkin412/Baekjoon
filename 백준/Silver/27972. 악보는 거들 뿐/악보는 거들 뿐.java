import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //음의 개수 M 입력
        int M = Integer.parseInt(br.readLine());
        
        //음 높이 배열 선언
        int[] P = new int[M];
        
        //음의 높이 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<M ;i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }
        
        //다이나믹 프로그래밍 배열 선언
        int[] dp = new int[M];
        int[] dp2 = new int[M];
        
        //초기값
        dp[0] = 1;
        dp2[0] = 1;

        //점화식
        for(int i=1 ; i<M ; i++) {
            if(P[i] > P[i-1]) {
                dp[i] = dp[i-1] + 1;
                dp2[i] = 1;
            }else if(P[i] < P[i-1]){
                dp[i] = 1;
                dp2[i] = dp2[i-1]+1;
            }else {
                dp[i] = dp[i-1];
                dp2[i] = dp2[i-1];
            }
        }
        
        int max = 0;

        //최댓값 갱신
        for(int i=0 ; i<M ; i++) {
           max = Math.max(max, Math.max(dp[i], dp2[i]));
        }

        System.out.println(max);
    }
}