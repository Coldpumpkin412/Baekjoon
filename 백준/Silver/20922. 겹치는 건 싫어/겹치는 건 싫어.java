import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] num = new int[N];
        
        //수열 a입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[100001];
        int start = 0;
        int end = 0;
        
        
        int answer = Integer.MIN_VALUE;

        while(end < N) {
            while(end<N && count[num[end]]+1<=K) {
                count[num[end++]]++;
            }
            
            int length = end - start;
            
            answer = Math.max(answer, length);

            count[num[start++]]--;
        }

        System.out.print(answer);
    }
}