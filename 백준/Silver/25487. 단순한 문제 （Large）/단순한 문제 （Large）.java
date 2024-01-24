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
            //정수 A, B, C 입력
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            //mod 성질을 활용하면 A==B==C를 만족하는 숫자는 최솟값이다
            sb.append(Math.min(A, Math.min(B, C))).append('\n');
        }
        
        System.out.print(sb);
    }
}