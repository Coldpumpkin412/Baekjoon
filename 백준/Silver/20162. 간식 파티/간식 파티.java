import java.util.*;
import java.io.*;

public class Main {
    
    private static int cal(int[] arr, int N) {
        //다이나믹 프로그래밍 배열 복사본으로 설정
        int[] dp = Arrays.copyOf(arr, N);
        
        int result= 0;
        
        for(int i=0 ; i<N ; i++){
            result = Math.max(result, arr[i]);
            
            for(int j=i+1 ; j<N ; j++){
                if(arr[i]<arr[j] && dp[i]+arr[j] > dp[j]){
                    dp[j] = dp[i] + arr[j];
                    
                    result = Math.max(result, dp[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //정수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        int[] input = new int[N];
        
        //간식 평점 입력
        for(int i=0 ; i<N ; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        int answer = cal(input, N);
        
        System.out.println(answer);
    }
}