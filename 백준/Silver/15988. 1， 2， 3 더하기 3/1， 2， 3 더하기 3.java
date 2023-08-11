import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
        //다이나믹 프로그래밍 활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍 배열 선언 및 초기값 입력
        long dp[] = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        //점화식 활용하여 배열 채워주기
        for(int i=4 ; i<=1000000 ; i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%1000000009;
        }
        	
        while(T-->0){
            System.out.println(dp[Integer.parseInt(br.readLine())]);
        }
        	
    }
}