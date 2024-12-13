
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, K, M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        br.readLine();  
        
        while(M-->0) {
            int i = Integer.parseInt(br.readLine());
            if(0<i && i<K) {
                continue;
            }
            if(i < 0 && N+i+1 > K) {
                continue;
            }
            K = i>0 ? i-K+1 : 2*N-K+i+1;
        }
        System.out.println(K);
    }
}