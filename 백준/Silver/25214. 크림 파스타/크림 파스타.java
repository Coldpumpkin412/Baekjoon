import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //N 입력 및 최솟값 선언
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        
        int answer = 0;
        
        st = new StringTokenizer(br.readLine());
        while(N-->0) {
            int cur = Integer.parseInt(st.nextToken());
            
            if(min > cur) {
                min = cur;
            }else {
                answer = Math.max(answer, cur-min);
            }
            
            sb.append(answer).append(' ');
        }
        
        System.out.println(sb.toString());
    }
}