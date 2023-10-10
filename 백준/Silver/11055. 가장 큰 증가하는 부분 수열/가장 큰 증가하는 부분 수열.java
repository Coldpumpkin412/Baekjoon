import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	//LIS 및 다이나믹프로그래밍 활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//수열 A의 크기 N 및 배열 입력
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	
    	//수열 값 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	    	
    	//다이나믹 프로그래밍에 활용될 배열 선언 및 초기값 입력
    	int[] dp = new int[N];
    	dp[0] = arr[0];
    	
    	//LIS알고리즘 활용
    	for(int i=1 ; i<N ; i++) {
    		//현재값
    		dp[i] = arr[i];
    		
    		for(int j=0 ; j<i ; j++) {
    			//
    			if(arr[i] > arr[j]) {
    				dp[i] = Math.max(dp[i], arr[i]+dp[j]);
    			}
    		}
    	}
    	
    	//오름차순 정렬 후 최댓값 출력
    	Arrays.sort(dp);
    	System.out.println(dp[N-1]);
    }
}	
