import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int a = 100 - N;
        int b = 100 - M;
        int c = 100 - (a + b);
        int d = a * b;

        int q = d / 100;
        int r = d % 100;

        System.out.printf("%d %d %d %d %d %d\n", a, b, c, d, q, r);
        System.out.printf("%d %d\n", c+q, r);
    }
}