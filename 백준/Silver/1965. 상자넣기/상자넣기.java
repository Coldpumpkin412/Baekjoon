import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	//LIS 및 다이나믹프로그래밍 활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//상자의 개수 입력 및 상자배열 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] box = new int[N];
    	
    	//상자 크기 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		box[i] = Integer.parseInt(st.nextToken());
    	}
    	//다이나믹프로그래밍에 활용될 배열 선언 및 초기값 선언
    	int[] dp = new int[N];
    	dp[0] = 1;
    	
    	//LIS(최장증가부분수열)알고리즘 활용 
    	for(int i=1 ; i<N ; i++) {
    		//dp배열 초기값
    		dp[i] = 1;
    		
    		for(int j=0 ; j<i ; j++) {
    			//이전상자보다 큰 경우
    			if(box[i] > box[j]) {
    				dp[i] = Math.max(dp[i], dp[j]+1);
    			}
    			
    		}
    	}
    	
    	//오름차순으로 정렬
    	Arrays.sort(dp);
    	
    	System.out.println(dp[N-1]);
    }
}	
