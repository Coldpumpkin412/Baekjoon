import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 패턴을 확인하여 점화식을 유추한 후 동적프로그래밍 활용
		 * 파도발 수열을 쭉 나열해보면 1번부터 5번까지 1,1,1,2,2의 값을 갖고
		 * 그 이후 6번째 부터는 F(n) = F(n-5) + F(n-1)의 성질을 갖는다
		 * ex) 6번째 삼각형의 한 변 = 1번 삼각형의 한 변 + 5번 삼각형의 한 변
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//동적프로그래밍에 활용할 배열 선언(N은 최대 100)
        //범위로 인해 long으로 선언
		long[] dp = new long[101];
		
		//초기값 선언
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		
		for(int i=6 ; i<=100 ; i++) {
			dp[i] = dp[i-1] + dp[i-5];
		}

		//테스트케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<T ; i++) {
			int N = Integer.parseInt(br.readLine());
			
			System.out.println(dp[N]);
		}
		
	}
}

	
