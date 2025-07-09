import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());

        while(N-->0) {
            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            int total = C*P - 2*(C-1);

            System.out.println(C + " " + P);
            System.out.println(total);
        }
    }
}