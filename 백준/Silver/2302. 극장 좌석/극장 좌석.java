import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//좌석의 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//좌석배열 선언
    	int[] seat = new int[N+1];
    	
    	//피보나치 수열을 표현할 dp배열 및 초기값 선언
    	int[] dp = new int[41];
    	dp[0] = 1;
    	dp[1] = 1;
    	dp[2] = 2;
    	
    	//dp배열 채워주기
    	for(int i=3 ; i<=N ; i++) {
    		dp[i] = dp[i-1] + dp[i-2];
    	}
    	
    	//고정석(VIP)의 개수 M 입력
    	int M = Integer.parseInt(br.readLine());
    	
    	int sum = 1;
    	
    	//VIP좌석을 제외한 나머지 좌석의 경우의 수 곱하기
    	int count = 0;
    	for(int i=0 ; i<M ; i++) {
    		int VIP = Integer.parseInt(br.readLine());
    		sum *= dp[VIP-count-1];
    		count = VIP;
    	}
    	
    	//이후 끝자리까지의 경우의 수 곱해주기
    	sum *= dp[N-count];
    	
    	
    	System.out.println(sum);
    }
}	
