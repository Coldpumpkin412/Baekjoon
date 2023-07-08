import java.util.*;
 
public class Main {
	
    //다이나믹 프로그래밍에 활용될 배열 및 포도주 배열 선언
	static Integer[] dp;
	static int[] wine;
    
    static int recur(int N) {
		
        //방문한 적 없는 dp배열이라면
		if(dp[N] == null) {
            //두 번째와, 첫 번쨰 + 세 번째 중 최댓값 vs 현재와 현재-1  중 최댓값
			dp[N] = Math.max(Math.max(recur(N - 2), recur(N - 3) + wine[N - 1]) + wine[N], recur(N - 1));
		}
		
		return dp[N];
	}
    
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new Integer[N + 1];
		wine = new int[N + 1];
		
        //포도주 입력
		for(int i=1 ; i<N+1 ; i++) {
			wine[i] = sc.nextInt();
		}
        
        //다이나믹프로그래밍 배열 초기값 입력
		dp[0] = 0;
		dp[1] = wine[1];
		
		//2번째의 경우 무조건 1번째 + 2번째의 합이 최대값이므로 
		if(N > 1) {
			dp[2] = wine[1] + wine[2];
		}
		
        //재귀함수 호출
		System.out.println(recur(N));
	}
}