import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());

        for(int i=1 ; i<=N; i++) {
            int max = 0;

            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<5 ; j++) {
                int rice = Integer.parseInt(st.nextToken());
                
                max = Math.max(rice, max);
            }
            
            System.out.printf("Case #%d: %d\n", i, max);
        }
        
    }
}