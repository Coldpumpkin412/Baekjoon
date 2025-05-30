import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            int n = Integer.parseInt(br.readLine());
            
            int sum = 0;
            
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken()); 
            }
            
            sb.append(sum + "\n");
        }
        
        System.out.print(sb.toString());
    }
}