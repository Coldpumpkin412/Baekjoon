import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	//피보나치 수를 표현할 다이나믹 프로그래밍배열 선언
    	int[] dp = new int[46];
    	
    	//dp배열 초기값 입력
    	dp[0] = 0;
    	dp[1] = 1;
    	
    	//피보나치 수들 배열에 저장
    	for(int i=2 ; i<=45; i++) {
    		dp[i] = dp[i-1] + dp[i-2];
    	}
    	
    	while(T-->0) {
    		StringBuilder sb = new StringBuilder();
    		
    		//출력값들 저장할 리스트 선언
    		List<Integer> list = new LinkedList<>();
    		
    		//N 입력
    		int N = Integer.parseInt(br.readLine());
    		
    		//큰 값들 부터 빼주기
    		for(int i=45 ; i>=1 ; i--) {
    			//N이 피보나치 값보다 큰 경우
    			if(N >= dp[i]) {
    				//빼준 후 해당 값 리스트에 저장
    				N -= dp[i];
    				list.add(dp[i]);
    			}
    			
    			//입력값이 0이 됐다면 루프 빠져나오기
    			if(N == 0) {
    				break;
    			}
    		}
    		
    		//리스트에 저장된 값들 오름차순 정렬
    		Collections.sort(list);
    		
    		//출력값 저장
    		for(int num : list) {
    			sb.append(num+" ");
    		}
    		
    		//결과 출력
    		System.out.println(sb.toString());
    	}
    }
}	
