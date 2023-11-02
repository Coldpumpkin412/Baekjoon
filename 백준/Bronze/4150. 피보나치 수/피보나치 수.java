import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        //다이나믹프로그래밍 배열 선언
        BigInteger[] dp = new BigInteger[N+1];
        
        //초기값 설정
        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);
        
        if(N > 1){
            dp[2] = BigInteger.valueOf(1);
        }
        
        //점화식
        for(int i=3 ; i<=N ; i++){
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        
        System.out.println(dp[N]);
    }
}