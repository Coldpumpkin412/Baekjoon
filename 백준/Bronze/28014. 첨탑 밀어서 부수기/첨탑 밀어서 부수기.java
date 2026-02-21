import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //첨탑 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //첨탑 높이 배열
        int[] H = new int[N+1];
        
        int answer = 1;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0 ; i<N ; i++) {
            if(H[i] <= H[i+1]){
                answer++;
            }
        }

        System.out.println(answer);
    }
}