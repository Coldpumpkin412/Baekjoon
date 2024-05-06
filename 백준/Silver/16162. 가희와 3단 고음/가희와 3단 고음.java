import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //음의 개수 N, 첫 항 A, 공차 D 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int value[] = new int[N];
        
        //음을 나타내는 N개 정수 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;
        for(int i=0 ; i<N ; i++) {
            if (value[i] != A) {
                continue;
            }
            max++;
            A += D;
        }

        sb.append(max);
        sb.append("\n");
        
        System.out.println(sb.toString());
    }
}