import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int A = 0;
        int B = 0;

        for(int i=0 ; i<2 ; i++) {
            st = new StringTokenizer(br.readLine());
            A += Integer.parseInt(st.nextToken());
            B += Integer.parseInt(st.nextToken());
        }

        if(A < B) {
            System.out.println("Hanyang Univ.");
        }else if(A > B) {
            System.out.println("Yongdap");
        }else {
            System.out.println("Either");
        }
    }
}