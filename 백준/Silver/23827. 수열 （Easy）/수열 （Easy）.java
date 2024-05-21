import java.util.*;
import java.io.*;

public class Main {
    
    static long MOD = 1000000007;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //수열길이 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //수열 배열 선언
        long[] arr = new long[N+1];
        
        //수열 값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N ; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        
        //누적합 배열 선언
        long[] prefixSum = new long[N+2];
        
        for(int i=N ; i>=1 ; i--) {
            prefixSum[i] += prefixSum[i+1]+arr[i];
        }
        
        long sum = 0l;
        
        for(int i=1 ; i<=N; i++) {
            sum += arr[i]*prefixSum[i+1];
            sum %= MOD;
        }
        
        System.out.println(sum);
    }
}