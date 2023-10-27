import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//게임판의 크기 N입력 및 다이나믹프로그래밍 배열 선언
    	int N = Integer.parseInt(br.readLine());

    	long[][] dp = new long[N+1][N+1];
    	
    	//초기값 입력
    	dp[1][1] = 1;
    	
    	for(int i=1 ; i<=N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for(int j=1 ; j<=N ; j++) {
    			//맵 값(이동가능한 거리) 입력
    			int distance = Integer.parseInt(st.nextToken());
    			
    			if(dp[i][j]>=1 && distance!=0) {
    				//맵을 벗어나지 않는다면
    				if(j+distance <= N) {
    					dp[i][j+distance] += dp[i][j];
    				}
    				if(i+distance <= N) {
    					dp[i+distance][j] += dp[i][j];
    				}
    			}
    		}
    	}
    	
    	System.out.println(dp[N][N]);
    }
}	
