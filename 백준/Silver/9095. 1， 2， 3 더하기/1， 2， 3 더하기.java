import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 패턴을 찾은 후 동적프로그래밍 활용
		 * 숫자n을 1,2,3의 합으로 나타내는 방법의 수를 dp[n]이라고 했을 때
		 * 
		 * 인덱스 : 0 1 2 3 4  5  6  7 ...
		 *  값   : 0 1 2 4 7 13 24  44 ...
		 *  
		 *  즉 4이상의 값부터 dp[n] = dp[n-1]+dp[n-2]+dp[n-3] 이라는 점화식이 유추된다
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//동적프로그래밍에 활용될 배열선언(입력값 n은 11보다 작기때문에 0~10까지의 크기를 갖는 배열을 선언한다)
		int[] dp = new int[11];
		
		//초기값 선언
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		//4부터 10까지의 값 할당
		for(int i=4 ; i<=10 ; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		//테스테케이스의 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<T ; i++) {
			int num = Integer.parseInt(br.readLine());
			
			//값 출력
			System.out.println(dp[num]);
		}
	}
}