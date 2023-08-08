import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
        //다이나믹 프로그래밍 활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력 및 다이나믹프로그래밍 배열 선언
		int N = Integer.parseInt(br.readLine());
		
        double[] dp = new double[N];
        
        double answer=0;
        
        //dp배열 초기값 입력
		for(int i=0 ; i<N ; i++) {
			dp[i] = Double.parseDouble(br.readLine());
		}
        
        //dp배열 값 비교
		for(int i=1 ; i<N ; i++) {
			dp[i] = Math.max(dp[i-1]*dp[i], dp[i]);
            
			answer=Math.max(answer, dp[i]);
		}
		System.out.println(String.format("%.3f", answer));
	}
}