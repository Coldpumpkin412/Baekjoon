import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        
        if (N <= K) {
            System.out.println(0);
            return;
        }
        int buy = 0;
        
        while (true) {
            count = 0;
            int copyN = N;
            
            while (copyN != 0) {
                if (copyN % 2 == 1) {
                    count++;
                }
                copyN /= 2;
            }
            if (count <= K)
                break;
            N++;
            buy++;
        }
        
        System.out.println(buy);
    }
}