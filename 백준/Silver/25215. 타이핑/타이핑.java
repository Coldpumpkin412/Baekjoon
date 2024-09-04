import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        //문자열 입력
        String str = br.readLine();
        
        //다이나믹 프로그래밍 배열 선언
        int[][] dp = new int[2][str.length()+1];

        str = " " + str; 
    
        //초기값
        dp[0][0] = 0;
        dp[1][0] = 1;

        for(int i=1 ; i<str.length() ; ++i) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z') {
                dp[0][i] = Math.min(dp[0][i-1]+1, dp[1][i-1]+2);
                dp[1][i] = dp[1][i-1] + 2; 
            }else {
                dp[1][i] = Math.min(dp[1][i-1]+1, dp[0][i-1]+2);
                dp[0][i] = dp[0][i-1] + 2; 
            }
        }

        System.out.println(Math.min(dp[0][str.length()-1], dp[1][str.length()-1]));
    }

}