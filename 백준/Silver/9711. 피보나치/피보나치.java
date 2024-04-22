import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //테스트 케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        //피보나치 수열 표현할 다이나믹프로그래밍 배열
        BigInteger[] dp = new BigInteger[10001];
        
        //피보나치를 표현할 배열의 초기값 선언
        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);

        for(int i=2 ; i<=10000 ; i++){
            dp[i] =  dp[i-2].add(dp[i-1]);
        }

        for(int i=1 ; i<=T ; i++){
            //P, Q입력
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            
            //몇번째 케이스의 답인지 출력형식 표현
            sb.append("Case #" + i + ": " + dp[P].remainder(BigInteger.valueOf(Q)) + "\n");
        }
        
        System.out.print(sb.toString());
    }
}