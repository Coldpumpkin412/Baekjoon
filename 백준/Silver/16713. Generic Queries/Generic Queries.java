import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //길이 N, 쿼리개수 Q 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        int pxor[] = new int[N+1];
        
        //수열값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            pxor[i+1] = pxor[i] ^ Integer.parseInt(st.nextToken());
        }
            
        
        int answer = 0;
        
        for(int i=0 ; i<Q ; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            
            answer = answer ^ (pxor[e] ^ pxor[s-1]);
        }
        System.out.println(answer);
    }
}