import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //동전종류 N, 목표금액 K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //다이나믹프로그래밍 선언
        int[] dp = new int[K+1];
        
        for(int i=0 ; i<N ; i++) {
        	//동전 종류 입력
        	int coin = Integer.parseInt(br.readLine());
        	
        	for(int j=1 ; j<=K ; j++) {
        		if(j == coin) {
        			dp[j]++;
        		}else if(j > coin) {
        			dp[j] += dp[j-coin];
        		}
        	}
        }
       
        
        System.out.println(dp[K]);
    }
}	
