import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int max = 0;
        
        while(N-->0) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            
            if(A == D+G) {
                A *= 2;
            }
            
            max = Math.max(max, A*(D+G));
        }
        
        System.out.println(max);
    }
}