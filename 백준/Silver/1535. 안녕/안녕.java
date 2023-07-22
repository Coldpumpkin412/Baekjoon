import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
        /*
         * 다이나믹 프로그래밍 활용
         */ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N 입력 및 다이나믹프로그래밍 활용배열, 체력배열, 기쁨배열 선언
		int N = Integer.parseInt(br.readLine());
        
		int[] dp = new int[100];
		int[] hp = new int[N];
		int[] joy = new int[N];
		
        //체력배열 값 입력
		st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<N ; i++) {
			hp[i] = Integer.parseInt(st.nextToken());
		}
		
        //기쁨배열 값 입력
		st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<N ; i++) {
			joy[i] = Integer.parseInt(st.nextToken());
		}
		
        //점화식 활용하여 다이나믹프로그래밍 값 할당
		for (int i=0 ; i<N ; i++) {
			for (int j=99 ; j>=hp[i] ; j--) {
				dp[j] = Math.max(dp[j-hp[i]]+joy[i], dp[j]);
			}
		}
		
        //결과출력
		System.out.println(dp[99]);
	}

}