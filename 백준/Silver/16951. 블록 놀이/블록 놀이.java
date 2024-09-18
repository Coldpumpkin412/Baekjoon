import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //탑의 수 N, 가장 좋아하는 정수 K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //탑 배열 선언
        int[] A = new int[N];
        
        //탑 높이 입력
        st = new StringTokenizer(br.readLine());        
        for(int i=0 ; i<N ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        
        for(int i=1 ; i<=1000 ; i++) {
            int count = 0;
            
            for(int j=0 ; j<N ; j++) {
                if(A[j] == i+j*K) {
                    count++;
                }
                    
            }
            max = Math.max(max, count);            
        }
        System.out.println(N - max);
    }
}