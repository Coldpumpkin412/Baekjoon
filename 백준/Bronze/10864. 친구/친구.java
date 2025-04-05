import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] cnt = new int[n+1];
        
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            cnt[Integer.parseInt(st.nextToken())]++;
            cnt[Integer.parseInt(st.nextToken())]++;
        }
        
        for (int i=1 ; i<=n ; i++) {
            sb.append(cnt[i]).append('\n');
        }
        
        System.out.print(sb);
    }
}