import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0;  
        int score = 0; 
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            int Q = Integer.parseInt(st.nextToken());
            
            if(Q == 1) {
                score++; 
                sum += score;
            } else {
                score = 0;  
            }
        }
        
        System.out.print(sum);
    }
}