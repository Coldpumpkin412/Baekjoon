import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N입력
		int N = Integer.parseInt(br.readLine());
        
        //N이 0혹은1이라면 그대로 출력
		if (N == 0) {
			System.out.println("0");
		} else if (N == 1) {
			System.out.println("1");
		} else { //아닌경우 다이나믹프로그래밍 활용(빅인티저 활용)
			BigInteger[] dp = new BigInteger[N+1];
        
            //초기값 0,1 설정
			dp[0] = BigInteger.ZERO;
			dp[1] = BigInteger.ONE;
            
            //이후는 점화식 활용하여 저장
			for (int i=2 ; i<=N ; i++) {
				dp[i] = dp[i-2].add(dp[i-1]);
			}

			System.out.println(dp[N]);
		}
	}
}