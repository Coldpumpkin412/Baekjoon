import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //A, B, C 입력
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int P = A;
        int Q = 2 * B * C;
        int R = A * (C*C - A*A + B*B);

        int D = Q*Q - 4*P*R;
        if(D < 0) {
            System.out.println(-1);
            return;
        }

        double X = (Math.sqrt(D) - Q) / (2*P);

        if(X < 0) {
            System.out.println(-1);
            return;
        }

        System.out.println((int)(X + 1e-5));
    }
}