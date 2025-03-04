import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //농장 층 수 N, 비 오는 횟수 M, 각 층이 버티는 빗물 양 K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long first = 0;
        
        boolean check = true;

        for (int i=0 ; i<M ; i++) {
            //비 정보 t, r 입력
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if(check) {
                first += r;

                if(first > K) {
                    System.out.println((i+1) + " " + 1);
                    check = false;
                }
            }
        }

        if (check) {
            System.out.println(-1);
        }
    }
}