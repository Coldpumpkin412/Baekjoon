import java.util.*;
import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         StringBuilder sb = new StringBuilder();
         
         while (true) {             
             st = new StringTokenizer(br.readLine());
             int A = Integer.parseInt(st.nextToken());
             int B = Integer.parseInt(st.nextToken());
            
             if(A==0 && B==0) {
                 break;
             }
            
             int hi = A>B ? A : B;
            
             int lo = A>B ? B : A;
            
             sb.append(A-B+A).append('\n');
         }
         
         System.out.print(sb.toString());
     }
}