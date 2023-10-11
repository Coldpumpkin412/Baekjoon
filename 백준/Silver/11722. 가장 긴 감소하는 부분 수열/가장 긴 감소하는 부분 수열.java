import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	//LIS알고리즘 응용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//수열 A의 크기 N 입력 및 수열 A 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] A = new int[N];
    	
    	//수열 A값 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());    	
    	}
    	
    	//다이나믹프로그래밍 배열 선언 및 초기값 입력
    	int[] dp = new int[N];
    	dp[0] = 1;
    	
        //LIS 알고리즘 응용
    	for(int i=1 ; i<N ; i++) {
    		dp[i] = 1;
    		
    		for(int j=0 ; j<i ; j++) {
    			if(A[i] < A[j]) { //이전 수가 더 크다면
    				dp[i] = Math.max(dp[i], dp[j]+1);
    			}
    		}
    	}
    	
    	Arrays.sort(dp);
    	
    	System.out.println(dp[N-1]);
    }
}	
