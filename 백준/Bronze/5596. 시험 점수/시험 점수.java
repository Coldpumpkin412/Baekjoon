import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int S = 0;
        int T = 0;
        
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            S += Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            T += Integer.parseInt(st.nextToken());
        }
        
        System.out.print(Math.max(S,T));
    }
}