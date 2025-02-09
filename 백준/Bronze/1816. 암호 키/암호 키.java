import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        long[] S = new long[N];
        
        for(int i=0 ; i<N ; i++) {
            S[i] = Long.parseLong(br.readLine());
        }

        double max = Math.pow(10, 6);

        for(int i=0 ; i<N ; i++) {
            long s = S[i];
            
            String result = "YES";
            
            for(long j=2L ; j<=max ; j++) {
                if(s%j == 0) {
                    result = "NO";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}