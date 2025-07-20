import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Integer.parseInt(br.readLine());

        int count = 0;

        while(count < Integer.MAX_VALUE) {
            count++;
            
            if(N == 1) {
                break;
            }
            
            if(N%2 == 1) {
                N = 3*N + 1;
            }else {
                N = N/2;
            }
        }

        System.out.print(count);
    }
}