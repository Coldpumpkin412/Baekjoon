import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int min = 1001;
        
        boolean check = true;
        while(N-->0) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A<B || A==B){
                check = false;                
                min = Math.min(min, B);
            } 
        }
        
        if(check) {
            System.out.println(-1);
        }else {
            System.out.println(min);
        }
    }
}