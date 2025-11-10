import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        
        st = new StringTokenizer(br.readLine());        
        while(st.hasMoreTokens()) {
            if(N == Integer.parseInt(st.nextToken())) {
                count++;
            }
        }
        
        System.out.print(count);
    }
}