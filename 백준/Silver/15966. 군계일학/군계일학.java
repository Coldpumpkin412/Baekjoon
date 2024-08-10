import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //수열 길이 N 입력
		int N = Integer.parseInt(br.readLine()); // 수열의 길이
		
        //수열 배열 선언
		int[] A = new int[N+1];
        
        //수열값 입력
        st = new StringTokenizer(br.readLine());
		for(int i=1 ; i<=N ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
        
		int max = 0;
        
        //다이나믹 프로그래밍 배열 선언
		int[] dp = new int[1000001];
		
		for(int i=1 ; i<=N ; i++) {
            //점화식
			dp[A[i]] = Math.max(dp[A[i]], dp[A[i]-1]+1);
            
            //최댓값 갱신
			max = Math.max(max, dp[A[i]]);
		}
        
		System.out.println(max);
	}
}
