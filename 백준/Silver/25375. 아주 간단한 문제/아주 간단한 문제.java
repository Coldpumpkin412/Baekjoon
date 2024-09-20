import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 Q 입력
        int Q = Integer.parseInt(br.readLine());
        
        while(Q-->0) {
            //a, b 입력            
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            
            sb.append((a*2<=b)&&(b%a==0) ? 1 : 0).append('\n');
        }
        System.out.println(sb.toString());
    }
}