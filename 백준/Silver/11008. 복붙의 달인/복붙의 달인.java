import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            //문자열 s, p 입력
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String p = st.nextToken();
            
            //p를 콤마로 변환
            s = s.replaceAll(p, ",");
            
            sb.append(s.length()).append('\n');
        }
        System.out.println(sb);
    }
}