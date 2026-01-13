import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        int max = Math.max(L, R);
        
        if(L==0 && R==0) {
            System.out.println("Not a moose");
            return;
        }
        
        if(L == R){
            System.out.print("Even ");
        }else {
            System.out.print("Odd ");
        }
        
        System.out.println(2*max);
        
    }
}