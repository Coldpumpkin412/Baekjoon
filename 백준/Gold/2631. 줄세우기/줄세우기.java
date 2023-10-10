import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	//LIS 및 다이나믹프로그래밍 활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//아이들의 수 N 입력 및 아이들 번호 배열 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] number  = new int[N];
    	
    	//아이들 번호 입력
    	for(int i=0 ; i<N ; i++) {
    		number[i] = Integer.parseInt(br.readLine());
    	}
    	
    	//다이나믹프로그래밍 배열 선언 및 초기값 입력
    	int[] dp = new int[N];
    	dp[0] = 1;
    	
    	//LIS알고리즘 활용
    	for(int i=1 ; i<N ; i++) {
    		dp[i] = 1;
    		
    		for(int j=0 ; j<i ; j++) {
    			//앞에 숫자보다 더 큰 경우
    			if(number[i] > number[j]) {
    				dp[i] = Math.max(dp[i], dp[j]+1);
    			}
    		}
    	}
    	
    	//오름차순 정렬 
    	Arrays.sort(dp);
    	
    	//최대증가수열 인원들을 제외한 나머지 인원들만 움직이는것이 최소 수
    	System.out.println(N-dp[N-1]);
    }
}	
