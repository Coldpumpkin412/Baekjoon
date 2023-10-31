import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//퇴직 날짜
		int N = Integer.parseInt(br.readLine());
		
		//시간 및 비용 배열 선언
		int[] t = new int[N];
		int[] p = new int[N];
		
		
		for (int i=0 ; i<N ; i++) {
			//상담 소요시간 및 비용 입력
			st = new StringTokenizer(br.readLine());
			
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		//다이나믹 프로그래밍 배열 선언
		int[] dp = new int[N+1];
		
		for (int i=0 ; i<N ; i++) {
			if (i+t[i] <= N) {
				//날짜가 범위를 넘어가지 않는 경우 다이나믹프로그래밍 배열을 최댓값으로 최신화(점화식)
				dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i]+p[i]);
			}
			
			//현재 경우의 수가 0일 수 있기 때문에 이전의 최대값을 넣어준다.
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		
		System.out.println(dp[N]);
    }
}	
