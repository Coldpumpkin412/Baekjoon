import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            long N = Long.parseLong(br.readLine());
            if(N == 0) {
                break;
            }
            
            sb.append(N*(N+1)/2).append('\n');
        }
        System.out.print(sb.toString());
    }

}