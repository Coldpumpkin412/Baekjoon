import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	//다이나믹 프로그래밍 활용
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//동전의 종류 개수 N 및 가치의 합 K ㅣㅂ력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	
    	//동전 가치 배열 입력
    	int[] coins = new int[N+1];
    	for(int i=1 ; i<=N ; i++) {
    		coins[i] = Integer.parseInt(br.readLine());
    	}
    	
    	//다이나믹프로그래밍에 활용될 배열 선언
    	int[] dp = new int[K+1];
    	
    	//최소횟수를 구하므로 최댓값으로 초기화(dp[0] = 0으로 두기)
    	for(int i=1 ; i<=K ; i++) {
    		dp[i] = Integer.MAX_VALUE-1;
    	}
    	
    	//점화식 활용하여 값 부여
    	for(int i=1 ; i<=N ; i++) {
    		for(int j=coins[i] ; j<=K ; j++) {
    			//최신화될 때 동전 수가 하나 늘어나므로 +1 해주기
    			dp[j] = Math.min(dp[j], dp[j-coins[i]] + 1);
    		}
    	}
    	
    	//dp[K]가 여전히 MAX_VALUE라면 만들 수 없는 경우이므로 -1 출력
    	System.out.println(dp[K]==Integer.MAX_VALUE-1 ? "-1" : dp[K]);
    }
}	
