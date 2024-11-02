import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st;
        
        //N, K, P, W 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        double P = Double.parseDouble(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        System.out.println((int)Math.ceil(P/W));
    }
}
