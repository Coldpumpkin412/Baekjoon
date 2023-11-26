import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //사용된 사각형의 개수 N 입력
		int N = Integer.parseInt(br.readLine());
		
        //다이나믹 프로그래밍 배열 선언(N은 80까지 이므로 81까지 선언)
		long[] dp = new long[81];
        
        //초기값 선언
		dp[1] = 4;
		dp[2] = 6;
        
        //규칙(이전 두개의 합과 같음)을 활용한 점화식
		for(int i=3 ; i<=N ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
					
		System.out.println(dp[N]);
		
	}
}