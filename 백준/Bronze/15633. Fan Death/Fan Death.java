import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        
        for(int i=1 ; i*i<=N ; i++) {
            if(N%i == 0) {
                count += i;
                if (i != N/i) {
                    count += N/i;
                }
            }
        }
        count = 5*count - 24;  
        
        System.out.println(count);
    }
}