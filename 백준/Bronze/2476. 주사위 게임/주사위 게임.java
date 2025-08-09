import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int max = 0; 
        int total = 0;
        
        for(int i=0 ; i<N ; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            if(A==B && B==C) {
                total = 10000 + 1000*A;
            }else if(A == B) {
                total = 1000 + 100*A;
            }else if(B==C) {
                total = 1000 + 100*B;
            }else if(C==A) {
                total = 1000 + 100*C;
            }else {
                total = Math.max(A, Math.max(B, C)) * 100;
            }
            max = Math.max(max, total);
        }
        
        System.out.print(max);
    }
}