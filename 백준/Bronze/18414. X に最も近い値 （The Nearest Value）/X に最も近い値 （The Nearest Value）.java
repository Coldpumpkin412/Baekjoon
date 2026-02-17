import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int answer = 0;
        
        int min = Integer.MAX_VALUE;
        
        for (int i=L ; i<=R ; i++) {
            if (min > Math.abs(X-i)) {
                min = Math.abs(X-i);
                answer = i;
            }
        }

        System.out.println(answer);
    }
}