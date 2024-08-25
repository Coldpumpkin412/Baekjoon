import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //산의 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //산 높이 배열 선언
        int[] H = new int[N];
        
        //산 높이 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        
        for(int i=0 ; i<N-1 ; i++) {
            answer += (Math.pow(H[i], 2) * 2) + (Math.pow(H[i+1], 2) * 2);
        }
        
        System.out.println(answer);
    }
}