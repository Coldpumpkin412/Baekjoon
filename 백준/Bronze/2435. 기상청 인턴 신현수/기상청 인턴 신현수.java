import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N,K입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
                
        int[] arr = new int[N];
        
        //온도입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = -2147483648;
        
        for(int i=0 ; i<=N-K ; i++) {
            int now = 0;
            
            for(int j=0 ; j<K ; j++) {
                now += arr[i+j];
            }
            max = Math.max(now, max);
        }
        
        System.out.println(max);
 
    }
 
}
 