import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        //점화식을 통해 다이나믹프로그래밍으로 풀기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력 (음수가 입력 되기때문에 1,000,000 더해주기)
        int N = Integer.parseInt(br.readLine()) + 1000000;
        
        //양수, 음수 모두 활용을 위해 2배크기로 dp 배열 설정
        long[] dp = new long[2000001];
        
        //초기값
        dp[1000001] = 1;
        
        //입력값 N 범위에 따라 점화식 다르게 적용(나머지를 구해야 하기때문에 모든 경우에 div)
        if(N < 1000000) {
            for(int i=999999 ; i>=N ; i--) {
                dp[i] = (dp[i+2]-dp[i+1]) % 1000000000;
            }
        }else {
            for(int i=1000002 ; i<=N ; i++) {
                dp[i] = (dp[i-1]+dp[i-2]) % 1000000000;
            }
        }
        
        //값에 따라 출력값 다르게 설정
        if(dp[N] > 0) { 
            //양수인 경우 1 출력
            System.out.println(1);
        }else if(dp[N] == 0) {
            //0인 경우 0 출력
            System.out.println(0);
        }else {
            //음수인 경우 -1 출력
            System.out.println(-1);
        } 
        
        //출력값의 절댓값 출력
        System.out.print(Math.abs(dp[N]));
    }
}