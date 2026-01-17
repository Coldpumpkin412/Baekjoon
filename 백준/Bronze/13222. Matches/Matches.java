import java.util.*;
import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
         
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        
        int length = W*W + H*H;
        
        while(N-->0) {
            int cur = Integer.parseInt(br.readLine());
            
            if(cur*cur <= length) {
                sb.append('Y').append('E').append('S').append('\n');
            }else {
                sb.append('N').append('O').append('\n');
            }
        }
         
        System.out.print(sb.toString());
    }
}