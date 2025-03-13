import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int sum = 0;

        if(A >= N) {
            sum += N;
        }else { 
            sum += A;
        }
        
        if(B >= N) {
            sum += N;
        }else {
            sum += B;
        }
        
        if(C >= N) {
            sum += N;
        }else { 
            sum += C;
        }

        System.out.println(sum);
    }
}