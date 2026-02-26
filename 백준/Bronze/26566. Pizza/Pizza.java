import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());

        for (int i=0 ; i<N ; i++) {
            st = new StringTokenizer(br.readLine());
            int A1 = Integer.parseInt(st.nextToken());
            int P1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int R1 = Integer.parseInt(st.nextToken());
            int P2 = Integer.parseInt(st.nextToken());

            int pizza1 = A1 / P1; 
            int pizza2 = (int)(R1 * R1 * Math.PI / P2);

            if(pizza1 < pizza2){
                System.out.println("Whole pizza");
            }else{
                System.out.println("Slice of pizza");
            }
        }

    }
}