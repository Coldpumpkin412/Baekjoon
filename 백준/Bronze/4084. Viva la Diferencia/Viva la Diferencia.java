import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Init
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            int count = 0;
            
            if(a==0 && a==b && a==c && a==d) {
                break;
            }
            
            while(a!=b || a!=c || a!=d) {
                ++count;
                
                int tmp = a;
                
                a = Math.abs(a - b);
                b = Math.abs(b - c);
                c = Math.abs(c - d);
                d = Math.abs(d - tmp);
            }
            sb.append(count).append("\n");
        }
       
        System.out.println(sb.toString());
    }
}