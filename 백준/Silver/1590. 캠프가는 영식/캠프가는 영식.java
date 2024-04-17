import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //버스 개수 N, 도착시간 T 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        
        int answer = Integer.MAX_VALUE;
        
        while(N-->0) {
            //S, I, C 입력
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int I = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            while (S<T && --C>0 && S<answer) {
                S += I;
            }
    
            //정답 최신화
            if(S >= T) {
                answer = Math.min(S, answer);
            }
        }
        System.out.println((answer==Integer.MAX_VALUE) ? -1 : answer-T);
    }     
}