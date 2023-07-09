import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int n = Integer.parseInt(br.readLine());

            //스티커 및 다이나믹프로그래밍 배열 선언 및초기화
            int[][] stickers = new int[2][n+1];
            int[][] dp = new int[2][n+1];
            
            for(int j=0 ; j<2 ; j++){
                String[] inputs = br.readLine().split(" ");
                
                for (int k=1 ; k<=n ; k++) {
                    stickers[j][k] = Integer.parseInt(inputs[k-1]);
                }
            }

	        //첫번째는 자기 자신이 최대이므로 자기 자신으로 초기화
            dp[0][1] = stickers[0][1];
            dp[1][1] = stickers[1][1];

            for (int j=2 ; j<=n ; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + stickers[1][j];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}