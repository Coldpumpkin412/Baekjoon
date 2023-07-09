import java.util.*;
 
public class Main {
    //나누기에 활용될 mod
	final static long mod = 1000000000;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        long answer = 0;
        
        //N 입력
		int N = sc.nextInt();
		
        //다이나믹 프로그래밍에 활용될 배열 선언(long타입)
		long[][] dp = new long[N + 1][10];
		
		//첫 번째 자릿수는 오른쪽 맨 끝의 자릿수이므로 경우의 수가 1개밖에 없음 
		for(int i=1 ; i<10 ; i++) {
			dp[1][i] = 1; 
		}
		
		for(int i=2 ; i<=N ; i++) {			
			for(int j=0 ; j<10 ; j++) {
				//자릿값이 0이면 이전 자릿수의 첫번째 자릿수만 가능 
				if(j == 0) {
					dp[i][0] = dp[i-1][1] % mod;
				}else if (j == 9) {//j=9인경우, 이전 자릿수는 8만 가능
					dp[i][9] = dp[i-1][8] % mod;
				}else {//그 외 : 이전 자릿수의 자릿값 +1, -1 의 합이 됨 
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
				}
			}
		}
		
		//각 자릿값마다의 경우의 수를 모두 더하기 
		for(int i=0 ; i<10 ; i++) {
			answer += dp[N][i];
		}
		
		System.out.println(answer%mod);
	}
 
}