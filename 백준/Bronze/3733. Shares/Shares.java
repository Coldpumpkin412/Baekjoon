import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String str = br.readLine();
            
            if(str == null) {
                break;
            }
            
            st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            
            sb.append(S / (N+1)).append('\n');
        }
        
        System.out.println(sb);
    }
}