import java.util.*;

class Solution {
    public int solution(int n) {
        /*
		 * 동적프로그래밍 활용
		 * n=1 일 때 1개
		 * n=2 일 떼 2개
		 * n=3 일 때 부터 n-1일때의 가지수와 n-2일때의 가지 수를 더해주면 된다
		 * 
		 * 즉, dp[n] = dp[n-1] + dp[n-2]라는 점화식을 유추할 수 있다
		 */
		
		//동적프로그래밍에 사용될 배열 선언(n은 60000이하 자연수)
		int[] dp = new int[60001];
		
		//초기값 설정
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		//3이상 부터 점화식 활용하여 값 할당
		for(int i=3 ; i<= 60000 ; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
		}
		
		return dp[n];
    }
}