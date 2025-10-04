import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();       
            
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int count = 1;

        for(int i=0 ; i<A ; i++) {
            for (int j=1 ; j<B ; j++) {
                sb.append(count).append(" ");
                count++;
            }
            sb.append(count).append("\n");
            count++;
        }

        System.out.println(sb.toString());
    }
}