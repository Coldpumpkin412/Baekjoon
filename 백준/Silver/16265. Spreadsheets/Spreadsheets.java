import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            StringBuilder sub = new StringBuilder();
            
            int k = Integer.parseInt(br.readLine());
            
            while(k > 0) {
                sub.append((char)('A' + (k-1) % 26));
                
                k = (k - 1) / 26;
            }
            sb.append(new StringBuffer(sub).reverse()).append('\n');
        }

        System.out.println(sb.toString());
    }
}