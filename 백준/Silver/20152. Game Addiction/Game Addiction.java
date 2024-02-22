import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
        
        //좌표 (H,H) (N,N)을 나타내는 H, N 입력
		int H = sc.nextInt();
		int N = sc.nextInt();
        
		int D = Math.abs(N-H);
        
        //다이나믹 프로그래밍 배열 선언
		long[][] dp = new long[D+1][D+1];
		Arrays.fill(dp[0], 1);
		
		for (int i=1 ; i<=D ; i++) {
			dp[i][i] = dp[i-1][i];
            
			for (int j=i+1 ; j<=D; j++) {
				dp[i][j] = dp[i][j-1]+dp[i-1][j];
			}
		}
        
		System.out.println(dp[D][D]);
	}
}
