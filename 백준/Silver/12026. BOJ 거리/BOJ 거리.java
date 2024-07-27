import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
		int N = Integer.parseInt(br.readLine());
        
        //다이나믹 프로그래밍 배열 선언 후 최댓값으로 선언
        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        //초기값 입력
        dp[0] = 0;
        
        //보도블럭 글자 입력 후 char배열로 변환
		char[] block = br.readLine().toCharArray();
		
		for(int i=1 ; i<N ; i++) {
			for(int j = 0; j < i; j++) {
                
				if(block[i]=='O' && block[j]=='B' && dp[j]!=Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j] + (i-j)*(i-j));
				}else if(block[i]=='J' && block[j]=='O' && dp[j]!=Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j] + (i-j)*(i-j));
				}else if(block[i]=='B' && block[j]=='J' && dp[j]!=Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j] + (i-j)*(i-j));
				}
				
			}
		}
        //최댓값 그대로라면 '-1'을, 아니면 dp[N-1]값 출력
		System.out.println((dp[N-1]==Integer.MAX_VALUE) ? -1 : dp[N-1]);
	}
}