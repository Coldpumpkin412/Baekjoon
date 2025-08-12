import java.util.*;
import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException {         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         
         int N = Integer.parseInt(br.readLine());
         
         int count = 0;
         
         st = new StringTokenizer(br.readLine());        
         for(int i=1 ; i<=N ; i++) {
             int index = Integer.parseInt(st.nextToken());
             
             if(i != index) {
                 count++;
             }
         }
         System.out.println(count);
     }
}