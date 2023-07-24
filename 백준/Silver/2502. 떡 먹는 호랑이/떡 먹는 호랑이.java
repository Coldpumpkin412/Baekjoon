import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        /*
         * 다이나믹프로그래밍 활용
         */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //N과 M입력 및 다이나믹프로그래밍 배열 선언
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
    	int[] dp = new int[N];
    	
    	for(int i=1 ; i<=M/2 ; i++) {
    		for(int j=i+1 ; j<M ; j++) {
                //다이나믹프로그래밍 배열 초기값 선언
    			dp[0] = i;
    			dp[1] = j;
                
    			for(int k=2 ; k<N ; k++) {
                    //점화식 활용
    				dp[k] = dp[k-1] + dp[k-2];
    			}
                
                //정답 저장
    			if(dp[N-1]==M) {
                    System.out.println(dp[0]);
    				System.out.println(dp[1]);
    				System.exit(0);
    			}
    		}
    	}
        
        System.out.println(sb);
    }
}