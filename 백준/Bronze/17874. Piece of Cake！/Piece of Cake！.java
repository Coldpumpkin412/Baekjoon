import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int answer = Math.max(H, N-H) * Math.max(V, N-V);

        System.out.println(4 * answer);
    }
}