import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//미로의 가로 크기 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//미로 선언
    	int[] map = new int[N+1];
    	
    	//각 칸 당 점프 가능 횟수 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=1 ; i<=N ; i++) {
    		map[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//활용할 다이나믹 프로그래밍 배열 선언
    	int[] dp = new int[N+1];
    	
    	//dp배열의 초기값을 모두 최댓값으로 설정
    	Arrays.fill(dp, Integer.MAX_VALUE);
    	
    	//초기값 설정
    	dp[1] = 0;
    	
    	for(int i=1 ; i<=N ; i++) {
    		//방문한적이 있다면
    		if(dp[i] != Integer.MAX_VALUE) {
    			//점프 가능한 칸 수
    			int jump = map[i];
    			
    			for(int j=1 ; j<=jump ; j++) {
    				//점프한 칸이 맵 끝을 넘을 경우 continue
    				if(i+j > N) {
    					continue;
    				}
    				
    				//최솟값으로 갱신
    				dp[i+j] = Math.min(dp[i]+1, dp[i+j]);
    			}
    		}
    	}
    	
    	//갱신이 되지않았다면 끝까지 도달하지 못했으므로 -1출력
    	System.out.println(dp[N]==Integer.MAX_VALUE ? -1 : dp[N]);
    }
}	
