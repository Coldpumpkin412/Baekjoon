import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	//LIS 및 다이나믹프로그래밍 활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//수열 A의 크기 N 및 수열 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] A  = new int[N];
    	
    	//수열 값 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	    	
    	//다이나믹 프로그래밍에 활용될 배열 선언 및 초기값 입력
    	int[] dp = new int[N];
    	dp[0] = 1;
    	
    	int max = 1;
    	    	
    	//LIS알고리즘 활용
    	for(int i=1 ; i<N ; i++) {
    		dp[i] = 1;
    		
    		for(int j=0 ; j<i ; j++) {
    			if(A[i] > A[j]) { //더 큰 값인 경우 dp 및 최댓값 최신화
    				dp[i] = Math.max(dp[i], dp[j]+1);
    				max = Math.max(max, dp[i]);
    			}
    		}
    	}
    	//최댓값 미리 저장해놓기
    	sb.append(max).append("\n");
    	
    	//수열값들 확인할 스택선언
    	Stack<Integer> stack = new Stack<>();
    	
    	//역추적
    	for(int i=N-1 ; i>=0 ; i--) {
    		if(dp[i] == max) { //dp값과 최댓값이 동일하면 스택에 넣어준 후 최댓값 감소
    			stack.push(A[i]);
    			max--;
    		}
    	}
    	
    	while(!stack.isEmpty()) {
    		sb.append(stack.pop()+" ");
    	}
    	
    	//출력
    	System.out.println(sb);
    }
}	
