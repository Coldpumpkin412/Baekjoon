import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        String A = br.readLine();
        String B = br.readLine();

        int count = 0;
        
        for(int i=0 ; i<A.length() ; i++) {
            if(A.charAt(i) == B.charAt(i)) {
                count++;
            }
        }

        System.out.print(A.length() - Math.abs(K-count));
    }
}