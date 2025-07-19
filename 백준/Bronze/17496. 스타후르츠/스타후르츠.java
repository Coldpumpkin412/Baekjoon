import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int T = Integer.parseInt(st.nextToken()); 
        int C = Integer.parseInt(st.nextToken()); 
        int P = Integer.parseInt(st.nextToken()); 

        int day = 1;
        
        int answer = 0;
        
        while (true) {
            day += T;
            
            if(day > N) { 
                break; 
            }
            answer += C*P;
        }

        System.out.println(answer);
    }
}