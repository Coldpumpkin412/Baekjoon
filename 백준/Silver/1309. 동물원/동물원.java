import java.io.*;
import java.util.*;
 
public class Main {
    //다이나믹 프로그래밍에 활용할 배열
	static int dp[][];
 
	public static void main(String[] args) throws IOException{
        /* 
         * 다이나믹 프로그래밍을 활용하여 풀기
         * Dp[n][0] -> 두 개의 방 중에 사자를 아예 넣지 않은 경우
         * Dp[n][1] -> 두 개의 방 중에 사자를 왼쪽 방에 넣은 경우
         * Dp[n][2] -> 두 개의 방 중에 사자를 오른쪽 방에 넣은 경우
         */
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        
        //다이나믹프로그래밍 활용 배열 선언 및 초기값 입력
		dp = new int[n+1][3];
		Arrays.fill(dp[1], 1);
        
		for(int i=2 ; i<=n ; i++){
            //점화식에 따른 값 입력
			dp[i][0] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2]; 
			dp[i][1] = dp[i-1][0] + dp[i-1][2];
			dp[i][2] = dp[i-1][0] + dp[i-1][1];
            
			dp[i][0] %= 9901;
			dp[i][1] %= 9901;
			dp[i][2] %= 9901;
		}
        
		int sum = 0;
		for(int i=0 ; i<3 ; i++){
			sum+=dp[n][i];
		}
        
		System.out.println(sum%9901);
	}
}