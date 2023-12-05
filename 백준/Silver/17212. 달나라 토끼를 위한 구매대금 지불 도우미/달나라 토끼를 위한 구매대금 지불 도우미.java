import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //토끼 지불금액 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍에 활용할 배열선언(N은 최대 100000)
        int[] dp = new int[100001];
        
        //초기값 입력(각 인덱스를 만들 수 있는 최소 동전의 개수)
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        dp[5] = 1;
        dp[6] = 2;
        dp[7] = 1;
        
        //점화식 활용
        //N원을 만들 때 N-1원, N-2원, N-5원, N-7원을 만드는 값중 최솟값+1 해주기
        for(int i=8 ; i<=N ; i++){
            dp[i] = Math.min(dp[i-1], Math.min(dp[i-2], Math.min(dp[i-5], dp[i-7])))+1;
        }
        System.out.print(dp[N]);
    }
}