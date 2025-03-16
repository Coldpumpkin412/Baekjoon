import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
            
        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        int num = L * P;
        
        st = new StringTokenizer(br.readLine());        
        while (st.hasMoreTokens()) {
            int N = Integer.parseInt(st.nextToken());
            sb.append(N - num + " ");
        }
        
        System.out.print(sb.toString());
    }
}