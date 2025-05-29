import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        double h = Math.abs(d1 - d2);
        double answer = (k*k) - (h*h)/4.0;

        sb.append(answer);
        System.out.println(sb.toString());

    }
}