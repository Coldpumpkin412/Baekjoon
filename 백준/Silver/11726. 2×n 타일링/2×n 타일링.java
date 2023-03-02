import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 동적프로그래밍 활용
		 * n=1 일 때 1개
		 * n=2 일 떼 2개
		 * n=3 일 때 부터 n-1일때의 가지수와 n-2일때의 가지 수를 더해주면 된다
		 * 
		 * 즉, dp[n] = dp[n-1] + dp[n-2]라는 점화식을 유추할 수 있다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//동적프로그래밍에 활용될 배열 선언(n은 1000이하이기때문에 1000개의 크기를 갖는 배열을 선언
		int[] dp = new int[1001];
		
		//초기값 선언
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		//3이상 부터의 값을 점화식 활용하여 할당해주기
		for(int i=3 ; i<=1000 ; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		
		//입력값에 따른 출력값
		System.out.println(dp[Integer.parseInt(br.readLine())]);
	}
}

	
