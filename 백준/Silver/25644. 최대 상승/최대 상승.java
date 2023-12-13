import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        int answer = 0;
        
        //최솟값 선언
        int min = Integer.MAX_VALUE;
        
        st = new StringTokenizer(br.readLine());
        while(N-->0) {
            //현재 값 입력
            int cur = Integer.parseInt(st.nextToken());
            
            //답을 최댓값으로 갱신
            answer = Math.max(answer, cur - min);
            
            //최솟값 갱신
            min = Math.min(min, cur);
        }
        
        System.out.println(answer);
    }
}