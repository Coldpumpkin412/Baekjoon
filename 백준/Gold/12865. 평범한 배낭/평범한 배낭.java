import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	/*
    	 * 다이나믹 프로그래밍 활용
    	 * 활용할 점화식 : dp[i][j] = max(현재 물건 가치+dp[이전 물건][현재 가방 무게-현재 물건 무게], dp[이전 물건][현재 가방 무게])
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//정답변수
    	int answer = 0;
    	
    	//무게 합, 가치 합 변수 선언
    	int weight_sum = 0;
    	int value_sum = 0;
    	
    	//물품의 수 N, 버틸 수 있는 무게 K 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	
    	//정답에 활용할 다이나믹프로그래밍 변수 선언
    	int[][] dp = new int[N+1][K+1];
    	
    	//무게배열 및 가치배열 선언
    	int[] weight = new int[N];
    	int[] value = new int[N];
    	
    	//물품의 무게와 가치 값들 입력
    	for(int i=0 ; i<N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		weight[i] = Integer.parseInt(st.nextToken());
    		value[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//점화식 활용하여 다이나믹프로그래밍 배열 채워주기
		for(int i=1 ; i<=N ; i++) {
			for(int j=1 ; j<=K ; j++) {
				if(weight[i-1]<=j) {
					dp[i][j] = Math.max(value[i-1]+dp[i-1][j-weight[i-1]], dp[i-1][j]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
				
				//더 큰 값으로 최신화
				answer = Math.max(dp[i][j], answer);
			}
		}
		
		//정답 출력
		System.out.println(answer);
    	
    }
}	
