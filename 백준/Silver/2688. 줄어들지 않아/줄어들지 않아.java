import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 선언
        int T = Integer.parseInt(br.readLine());
        
        /*
         * 다이나믹 프로그래밍에 활용할 2차원배열 선언
         * dp[i][j](i : 숫자의 자릿수, j : 숫자 1~9)
         */
        long[][] dp = new long[65][10]; //자리수 max 64 , 숫자 1~9
        
        //1자리인 경우인 dp[1][n]는 모두 1로 초기값 입력
        for(int i=0 ; i<=9; i++){
            dp[1][i] = 1;
        }

        //점화식 활용
        for(int i=2 ; i<=64 ; i++){
            for(int j=0 ; j<=9 ; j++){
                for(int k=j ; k<=9 ; k++){
                    dp[i][j] += dp[i-1][k];
                }
            }
        }
        
        while(T-->0){
            //자릿수 N 입력
            int N = Integer.parseInt(br.readLine());
            
            long answer = 0;

            for(int i=0 ; i<=9 ; i++) {
                answer += dp[N][i];
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}