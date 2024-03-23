import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            //배열의 크기 N 입력 및 배열선언
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N+1];
            
            //다이나믹프로그래밍 배열 선언
            int[] dp = new int[N+1];
            
            //최댓값 변수
            int max = Integer.MIN_VALUE;
            
            st = new StringTokenizer(br.readLine());
            for(int i=1 ; i<=N ; i++) {
                //배열값 선언
                arr[i] = Integer.parseInt(st.nextToken());
                
                //dp배열 값 입력 및 최댓값 갱신
                dp[i] = dp[i-1] + arr[i];
                
                max = Math.max(max, Math.max(arr[i], dp[i]));
            }
            
            for (int i=1 ; i<=N ; i++) {
                for (int j=N ; j>i ; j--) {
                    //최댓값 갱신
                    max = Math.max(max, dp[j]-dp[i]);
                }
            }
            sb.append(max + "\n");
        }
        
        System.out.print(sb.toString());
    }
}