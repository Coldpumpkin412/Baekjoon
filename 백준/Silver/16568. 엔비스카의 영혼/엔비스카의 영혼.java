import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //사람수 N, A, B 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        //다이나믹 프로그래밍 배열 선언
        int[] dp = new int[N+1];
        
        for(int i=1 ; i<=N ; i++) {
            dp[i] = dp[i-1] + 1;
            
            //점화식
            if(i-A >= 1) {
                dp[i] = Math.min(dp[i], dp[i-A-1]+1);
            }
            
            //점화식
            if(i-B >= 1){
                dp[i] = Math.min(dp[i], dp[i-B-1]+1);
            }
        }
        
        System.out.println(dp[N]);
    }
}