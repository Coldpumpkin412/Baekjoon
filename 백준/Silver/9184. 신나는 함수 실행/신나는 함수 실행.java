import java.util.*;
import java.io.*;

public class Main {
	//다이나믹 프로그래밍에 활용될 배열
	static int[][][] dp = new int[21][21][21];
	
    //문제에 주어진 w함수
	public static int w(int a, int b, int c) {
		
		if(a<=0 || b<=0 || c<=0) {
			return 1;
		}
		if(a>20 || b>20 || c>20) {
			return w(20, 20, 20);
		}
		
		if(dp[a][b][c] != 0) {
			return dp[a][b][c];
		}
		
		if(a<b && b<c) {
			dp[a][b][c] =  w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            
			return dp[a][b][c];
		}
		
		dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        
		return dp[a][b][c];
	}
	
	public static void main(String[] args) throws IOException{
        /*
         * 다이나믹 프로그래밍 및 재귀함수 활용
         */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
		while(true) {
			//값 3개 입력
            st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			//셋 다 -1이 입력 되면 루프 나가기
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
		}
		
	}
}