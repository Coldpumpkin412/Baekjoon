import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        //다이나믹 프로그래밍 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍에 활용될 배열 선언
        //N이 최대 90 자리이기때문에 long으로 선언
        long dp[] = new long[count+1];
        
        //초기값 설정
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i=2 ; i<=count ; i++){
            //해당 규칙(점화식)을 만족함
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        System.out.println(dp[count]);
    }
}